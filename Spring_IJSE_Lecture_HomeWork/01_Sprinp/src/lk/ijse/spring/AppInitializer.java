package lk.ijse.spring;

import lk.ijse.spring.bean.SpringBean_1;
import lk.ijse.spring.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();

        ctx.register(AppConfig.class);
        ctx.refresh();
        //final SpringBean_1 springBean_1 = (SpringBean_1) ctx.getBean("springBean_1");//class first letter simple
        final SpringBean_1 springBean_1 = (SpringBean_1) ctx.getBean("a");//using bean ID
        springBean_1.test();
        ctx.registerShutdownHook();

    }
}
