package com.example.topic.spring.chapter2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.topic.spring.bean.TestBean;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class BeanFactoryTest {

    @Test
    public void testSimpleLoad() {
        DefaultListableBeanFactory bf = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(bf);
        reader.loadBeanDefinitions(
                new ClassPathResource("xml/beanFactoryTest.xml", this.getClass()));
        TestBean testBean = bf.getBean(TestBean.class); // there should be only one
        assertEquals("Hello str.", testBean.getStr());
    }

}
