package com.example.order.config;

import com.example.cola.ColaHttpInterceptorHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class WebAppConfigurer extends WebMvcConfigurationSupport {

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new ColaHttpInterceptorHandler()).addPathPatterns("/**");
        super.addInterceptors(registry);

    }
}
