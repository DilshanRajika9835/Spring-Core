package lk.ijse.spring.config;

import lk.ijse.spring.bean.SpringBean_Two;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig_Two {
    @Bean
    public SpringBean_Two springBean_two(){
        return new SpringBean_Two();
    }
}
