package lk.ijse.spring;

import lk.ijse.spring.bean.Bean_01;
import lk.ijse.spring.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        final Bean_01 bean1 = ctx.getBean(Bean_01.class);
        System.out.println(bean1);
        final Bean_01 bean2 = ctx.getBean(Bean_01.class);//Ctx Invocation
        System.out.println(bean2);
        ctx.registerShutdownHook();
    }



}
/*-----------------@Scope("singleton")--------------------------------------*/
/*
Default behavior
Bean One Instantiated.....
lk.ijse.spring.bean.Bean_01@c540f5a
lk.ijse.spring.bean.Bean_01@c540f5a
* */
/*-----------@Scope("prototype")-----------------------------------------*/

/*
Bean One Instantiated.....
lk.ijse.spring.bean.Bean_01@145eaa29
Bean One Instantiated.....
lk.ijse.spring.bean.Bean_01@15bb6bea
*/
/*--------------------Disposable Bean Not Working Prototype @Scope ------------------*/
/*
Bean One Instantiated.....
Bean One NameAware....
Bean One Bean FactoryAware....
Bean One Application ContextAware....
Bean One Initializing Bean....
lk.ijse.spring.bean.Bean_01@400cff1a
Bean One Instantiated.....
Bean One NameAware....
Bean One Bean FactoryAware....
Bean One Application ContextAware....
Bean One Initializing Bean....
lk.ijse.spring.bean.Bean_01@275710fc*/