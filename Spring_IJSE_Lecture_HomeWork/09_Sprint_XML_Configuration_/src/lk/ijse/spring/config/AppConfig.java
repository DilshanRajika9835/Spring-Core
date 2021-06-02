package lk.ijse.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages = "lk.ijse.spring.bean")
@ImportResource("classpath:Main.xml")//class path import
//@ImportResource("filepath:C/file/folder/Main.xml")//Absolute  path import
public class AppConfig {
}
