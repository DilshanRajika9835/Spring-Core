package lk.ijse.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "lk.ijse.spring.bean")
@PropertySource("classpath:application.properties")
@PropertySource("classpath:application_Two.properties")
public class AppConfig {
}
