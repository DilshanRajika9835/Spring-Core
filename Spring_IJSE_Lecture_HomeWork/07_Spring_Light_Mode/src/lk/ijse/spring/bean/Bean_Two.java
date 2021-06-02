package lk.ijse.spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Bean_Two  implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public Bean_Two(){
        System.out.println("Bean_Two  Instantiated.....");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Bean_Two  BeanFactory Aware.....");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean_Two   BeanName Aware.....");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Bean_Two  ApplicationContext Aware.....");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean_Two  Initializing Bean.....");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Bean_Two  Disposable Bean.....");
    }

}
