package lk.ijse.spring.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import javax.xml.ws.soap.Addressing;

@Component
public class SpringBean_Four implements InitializingBean {
    @Autowired
    Environment env;
    public SpringBean_Four() {
        System.out.println("Spring Bean Four Instantiated.....");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        final String user1 = env.getProperty("OS");//System Environment when our key is wrong it return null
        final String user2 = env.getProperty("user.country");//System.Get.Properties when our key is wrong it return null
        final String user3 = env.getProperty("user.name");//Resource bundle when our key is wrong it return null
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
        /*
        Windows_NT
        US
        DilshanRajika
        */

        final String user4 = env.getRequiredProperty("user.name");// Resource bundle when our key is wrong it return
        // Exception
        System.out.println(user4);
    }
}
