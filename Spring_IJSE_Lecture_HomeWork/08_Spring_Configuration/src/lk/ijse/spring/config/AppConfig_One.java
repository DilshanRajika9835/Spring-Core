package lk.ijse.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = "lk.ijse.spring.bean")
//@ComponentScan(basePackages = "lk.ijse.spring")//Option III Configuration
//@Import({AppConfig_Two.class,AppConfig_Three.class})//Option II Configuration
public class AppConfig_One {

}
