package lk.ijse.spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class DBConnection  implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public DBConnection(){
        System.out.println("DBConnection  Instantiated....");//adding Bean class container
    }
    @Override
    public void setBeanName(String name) {
        System.out.println("DBConnection  NameAware....");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("DBConnection  Bean FactoryAware....");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("DBConnection  Application ContextAware....");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("DBConnection  Initializing Bean....");//ready bean Successfully
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DBConnection  Disposable Bean....");//close the bean
    }
}
