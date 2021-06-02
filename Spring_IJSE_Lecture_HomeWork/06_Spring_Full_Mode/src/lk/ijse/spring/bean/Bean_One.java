package lk.ijse.spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component //full mode
public class Bean_One  implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public Bean_One(){
        System.out.println("Bean_One  Instantiated.....");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Bean_One  BeanFactoryAware.....");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean_One   BeanNameAware.....");
    }


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Bean_One  ApplicationContextAware.....");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean_One  InitializingBean.....");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Bean_One  DisposableBean.....");
    }
}
