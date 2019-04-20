package com.example.topic.annotation;

import lombok.extern.slf4j.Slf4j;

@MyAnnotation("myAnnotationValue")
@Slf4j
public class MyAnnotationTest {

    public static void main(String[] args) {

        /**
         * 判断MyAnnotationTest类是否使用MyAnnotation注解，使用反射
         * sun.reflect.annotation.AnnotatedTypeFactory.AnnotatedTypeBaseImpl#getDeclaredAnnotation(java.lang.Class)
         *
         * 被注解修饰的类对象和注解拥有相同的生命周期
         */
        if (MyAnnotationTest.class.isAnnotationPresent(MyAnnotation.class)) {
            MyAnnotation myAnnotation = MyAnnotationTest.class.getAnnotation(MyAnnotation.class);
            log.info(myAnnotation.toString());
        }
    }

}
