package lk.ijse.spring.config;

import lk.ijse.spring.bean.Bean_One;
import lk.ijse.spring.bean.Bean_Two;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "lk.ijse.spring")
public class AppConfig {
        @Bean //Bean Method
    public Bean_One bean_one(){
            final Bean_Two bean_two1 = bean_two();
            final Bean_Two bean_two2 = bean_two();
            System.out.println(bean_two1);//lk.ijse.spring.bean.Bean_Two@279ad2e3
            System.out.println(bean_two2);//lk.ijse.spring.bean.Bean_Two@279ad2e3
            return new Bean_One();//Inter Bean Dependency Satisfy in Full Mode

    }
    @Bean
    public  Bean_Two bean_two(){
        return new Bean_Two();
    }

}
