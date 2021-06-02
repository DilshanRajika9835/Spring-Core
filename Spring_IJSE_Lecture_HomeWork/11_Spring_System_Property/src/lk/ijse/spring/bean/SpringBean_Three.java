package lk.ijse.spring.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component

public class SpringBean_Three implements InitializingBean {
    @Value("${user.db}")
    String dbName;
    @Value("${user.name.fullName}")//using property file values
    String osName;
    public SpringBean_Three() {
        System.out.println("Spring Bean Three Instantiated.....");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Spring Bean Three Instantiated....."+dbName);
        System.out.println("Spring Bean Three Instantiated....."+osName);
    }
}
