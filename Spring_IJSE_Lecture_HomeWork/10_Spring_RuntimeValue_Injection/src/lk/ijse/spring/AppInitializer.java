package lk.ijse.spring;

import lk.ijse.spring.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        ctx.registerShutdownHook();

    }
}
/*
Spring Bean One Parameterized Constructor Instantiated......
C001 Name
Spring Bean Two Parameterized Constructor  instantiated....
Kamal
Nimal
Piyal
Ravidhu
*/