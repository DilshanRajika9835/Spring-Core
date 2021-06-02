package lk.ijse.spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Bean_Two implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public Bean_Two(){
        System.out.println("Spring Bean Two Instantiated...... ");
    }
    @Override
    public void setBeanName(String name) {

        System.out.println("Bean Two  BeanFactoryAware.....");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean Two   BeanNameAware.....");
    }


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Bean Two  ApplicationContextAware.....");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean Two  InitializingBean.....");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Bean Two  DisposableBean.....");
    }
}
