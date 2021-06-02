package lk.ijse.spring;

import lk.ijse.spring.config.AppConfig_One;
import lk.ijse.spring.config.AppConfig_Three;
import lk.ijse.spring.config.AppConfig_Two;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
     AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();
     ctx.register(AppConfig_One.class);
     ctx.register(AppConfig_Two.class); //Option I
     ctx.register(AppConfig_Three.class); //Option I
     ctx.refresh();
     ctx.registerShutdownHook();
    }
}
/*
Spring Bean one Instantiated.......
Spring Bean Two Instantiated.......
Spring Bean Three Instantiated.......
*/