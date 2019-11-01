package com.example.cola;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class ColaHttpInterceptorHandler extends HandlerInterceptorAdapter {


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
                             Object handler) {
        String country = request.getHeader(Constants.COUNTRY);
        String bizCode = request.getHeader(Constants.BIZ_CODE);
        ExtensionContext.set(Constants.COUNTRY, country);
        ExtensionContext.set(Constants.BIZ_CODE, bizCode);
        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response,
                                Object handler, Exception ex) {
        ExtensionContext.clear();
    }
}
