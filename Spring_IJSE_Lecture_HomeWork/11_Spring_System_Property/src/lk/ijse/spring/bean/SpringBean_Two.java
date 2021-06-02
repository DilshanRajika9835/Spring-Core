package lk.ijse.spring.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBean_Two implements InitializingBean {
    //"${}"property place holder
    @Value("${user.country}")//Java  Property Key
    String country;
    public SpringBean_Two() {
        System.out.println("Spring Bean Two Instantiated...... ");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("====="+country+"====="+"${user.country}");
    }


}


