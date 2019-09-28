package com.example.spring.persnal.tag;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

public class UserBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {
    private static final String USER_FIELD_NAME = "name";
    private static final String USER_FIELD_AGE = "age";

    @Override
    protected void doParse(Element element, BeanDefinitionBuilder builder) {

        String name = element.getAttribute(USER_FIELD_NAME);
        String age = element.getAttribute(USER_FIELD_AGE);

        if (StringUtils.hasText(name)) {
            builder.addPropertyValue(USER_FIELD_NAME, name);
        }

        if (StringUtils.hasText(age)) {
            builder.addPropertyValue(USER_FIELD_AGE, age);
        }
    }

    @Override
    protected Class<?> getBeanClass(Element element) {
        return User.class;
    }
}
