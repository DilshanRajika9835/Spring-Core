package lk.ijse.spring.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Bean_Four implements InitializingBean {
    @Value("Dilshan Rajika")
    String name;
    public Bean_Four() {
        System.out.println("Spring Bean Four Instantiated ......."+name);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Spring Bean Four InitializingBean....... "+name);
    }
}
