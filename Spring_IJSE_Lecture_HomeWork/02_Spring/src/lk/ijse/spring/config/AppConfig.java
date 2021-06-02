package lk.ijse.spring.config;

import lk.ijse.spring.bean.DBConnection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "lk.ijse.spring")
public class AppConfig {
    @Bean
    //@Bean("a") we can use bean ID like this
    public DBConnection dbConnection(){
        return new DBConnection();
        //other class not we created  so we can manage life cycle like this.
    }

}
