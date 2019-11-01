
package com.example.cola;

import lombok.Getter;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.*;


@Component
public class ExtensionRepository implements ApplicationContextAware {


    @Getter
    private static Map<String, List<ExtensionPointI>> EXTENSION_REPO = new HashMap<>();


    public void putExtension(String key, ExtensionPointI pointI) {
        List<ExtensionPointI> pointIS = EXTENSION_REPO.get(key);
        if (pointIS == null) {
            pointIS = new ArrayList<>();
            pointIS.add(pointI);
            EXTENSION_REPO.put(key, pointIS);
        } else {
            pointIS.add(pointI);
        }
    }


    public <T> void execute(T t) {
        String country = ExtensionContext.get(Constants.COUNTRY);
        String bizCode = ExtensionContext.get(Constants.BIZ_CODE);
        List<ExtensionPointI> extensionPoints = EXTENSION_REPO.get(country + "." + bizCode);

        for (ExtensionPointI extensionPoint : extensionPoints) {
            extensionPoint.execute(t);
        }
    }


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

        Map<String, Object> beansWithAnnotationExtension = applicationContext.getBeansWithAnnotation(Extension.class);

        beansWithAnnotationExtension.forEach((beanName, bean) -> {
            Class<?> beanClass = bean.getClass();
            Extension extension = beanClass.getAnnotation(Extension.class);
            putExtension(extension.country() + "." + extension.bizCode(), (ExtensionPointI) bean);

        });

        getEXTENSION_REPO().forEach((key, value) -> {
            Collections.sort(value, (o1, o2) -> {
                if (o1 == null) {
                    return -1;
                } else if (o2 == null) {
                    return 1;
                } else {
                    return o1.getClass().getAnnotation(Extension.class).order() - o2.getClass().getAnnotation(Extension.class).order();
                }
            });
        });

    }

}
