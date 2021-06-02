package lk.ijse.spring;


import lk.ijse.spring.bean.DBConnection;
import lk.ijse.spring.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();

        ctx.register(AppConfig.class);
        ctx.refresh();
        /*-------------------------------------------------------------------*/
     /*   final DBConnection bean1 = ctx.getBean(DBConnection.class);
        final DBConnection bean2 = ctx.getBean(DBConnection.class);
        System.out.println(bean1);//lk.ijse.spring.bean.DBConnection@75f9eccc
        System.out.println(bean2);//lk.ijse.spring.bean.DBConnection@75f9eccc
        */
        /*-------------------------------------------------------------------*/
     /* final Object bean1 = ctx.getBean("a");
        final Object bean2 = ctx.getBean("a");
        System.out.println(bean1);
        System.out.println(bean2);*/
        /*-------------------------------------------------------------------*/
/*        final DBConnection bean1 = (DBConnection) ctx.getBean("dBConnection");
        final DBConnection bean2 = (DBConnection) ctx.getBean("dBConnection");*/

        //Exception in thread "main" org.springframework.beans.factory.
        // NoSuchBeanDefinitionException: No bean named 'dBConnection' available

        /*-------------------------------------------------------------------*/
        // if we use @Bean annotation bean id Generate not class id it use method name
       /* final DBConnection bean1 = (DBConnection) ctx.getBean("dbConnection");
        final DBConnection bean2 = (DBConnection) ctx.getBean("dbConnection");
        System.out.println(bean1);//lk.ijse.spring.bean.DBConnection@64c87930
        System.out.println(bean2);//lk.ijse.spring.bean.DBConnection@64c87930*/

        /*-------------------------------------------------------------------*/

        ctx.registerShutdownHook();

    }
}
