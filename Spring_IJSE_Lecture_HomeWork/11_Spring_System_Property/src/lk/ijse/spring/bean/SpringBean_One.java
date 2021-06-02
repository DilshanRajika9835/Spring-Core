package lk.ijse.spring.bean;

import org.springframework.aop.AfterAdvice;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBean_One implements InitializingBean {
    //"${}"property place holder
    @Value("${COMPUTERNAME}")//system env keys
    String name;
    public SpringBean_One() {
        System.out.println("Spring Bean One Instantiated...... ");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("====="+name+"====="+"${COMPUTERNAME}");
    }


}


