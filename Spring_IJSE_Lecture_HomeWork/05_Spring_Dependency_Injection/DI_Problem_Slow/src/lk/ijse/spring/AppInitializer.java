package lk.ijse.spring;

import lk.ijse.spring.bean.Boy;
import lk.ijse.spring.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();

        ctx.register(AppConfig.class);
        ctx.refresh();
        ctx.registerShutdownHook();
        final Boy boy = ctx.getBean(Boy.class);
        boy.ChatWithGirl();
    }

}

/*Caused by: org.springframework.beans.factory.NoUniqueBeanDefinitionException: No qualifying bean of type 'lk.ijse.spring.bean.GoodGirl' available: expected single matching bean but found 2: girl_One,girl_Two*/

/*
Boy Instantiated.....
Girl_One Instantiated.....
Girl_Two Instantiated.....
Girl One Chat With my Boy....
 */