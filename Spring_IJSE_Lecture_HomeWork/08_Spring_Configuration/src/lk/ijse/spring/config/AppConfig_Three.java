package lk.ijse.spring.config;

import lk.ijse.spring.bean.SpringBean_Three;
import lk.ijse.spring.bean.SpringBean_Two;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig_Three {
    @Bean
    public SpringBean_Three springBean_three(){
        return new SpringBean_Three();
    }
}
