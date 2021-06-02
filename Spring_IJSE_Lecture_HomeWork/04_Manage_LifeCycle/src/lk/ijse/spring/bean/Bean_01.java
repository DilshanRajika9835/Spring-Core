package lk.ijse.spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("singleton")
@Scope("prototype")
public class Bean_01 implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public Bean_01(){
        System.out.println("Bean One Instantiated.....");
    }

    @Override
    public void setBeanName(String name) {

        System.out.println("Bean One NameAware....");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean One Bean FactoryAware....");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Bean One Application ContextAware....");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean One Initializing Bean....");//ready bean Successfully
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Bean One Disposable Bean....");//close the bean
    }
}
