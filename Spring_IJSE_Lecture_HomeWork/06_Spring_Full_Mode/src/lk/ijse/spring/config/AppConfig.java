package lk.ijse.spring.config;


import lk.ijse.spring.bean.Bean_Two;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "lk.ijse.spring")
public class AppConfig {
        @Bean //full  mode
    public Bean_Two bean_two(){
        return new Bean_Two();
    }
}
