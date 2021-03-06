package com.example.spring.chapter2;

import com.example.spring.bean.TestBean;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
