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
Spring Bean Three Instantiated........
Bean_Two  Instantiated.....
lk.ijse.spring.bean.Bean_Two@1dd92fe2
Bean_Two  Instantiated.....
lk.ijse.spring.bean.Bean_Two@6b53e23f
Bean_One  Instantiated.....
Bean_One  BeanFactoryAware.....
Bean_One   BeanNameAware.....
Bean_One  ApplicationContextAware.....
Bean_One  InitializingBean.....

Bean_Two  Instantiated.....
Bean_Two  BeanFactoryAware.....
Bean_Two   BeanNameAware.....
Bean_Two  ApplicationContextAware.....
Bean_Two  InitializingBean.....
Bean_Two  DisposableBean.....
Bean_One  DisposableBean.....

Process finished with exit code 0


*/