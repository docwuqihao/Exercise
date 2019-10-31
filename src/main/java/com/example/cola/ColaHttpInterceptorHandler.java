package com.example.cola;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class ColaHttpInterceptorHandler extends HandlerInterceptorAdapter {


    private static final Logger logger = LoggerFactory
            .getLogger(ColaHttpInterceptorHandler.class);


    @Autowired
    ExtensionContext extensionContext;


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
                             Object handler) {
        String country = request.getHeader("country");
        String bizCode = request.getHeader("bizCode");
        extensionContext.set("country", country);
        extensionContext.set("bizCode", bizCode);
        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response,
                                Object handler, Exception ex) {

        extensionContext.clear();

    }


}
