package com.example.spring.persnal.tag;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {


    /**
     * 1. 创建一个需要扩展的组件，实体对象User
     * 2. 定义一个XSD文件，描述组件内容
     * 3. 定义类 实现 BeanDefinitionParser接口，用以解析XSD文件中的定义和组件定义，UserBeanParser
     * 4. 创建一个Handler类 扩展 自NamespaceHandlerSupport，目的是将组件注册到Spring容器,
     * 5. 编写Spring.handlers和Spring.schemas文件
     */

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/application.xml");

        User user = context.getBean(User.class);

        System.out.println(user);
    }

}
