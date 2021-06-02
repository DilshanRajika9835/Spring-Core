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

