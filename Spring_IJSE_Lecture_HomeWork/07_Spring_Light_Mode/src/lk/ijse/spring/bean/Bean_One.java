package lk.ijse.spring.bean;

import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Bean;
@Component
public class Bean_One  {
        public Bean_One(){
        System.out.println("Bean One Instantiated.....");
    }

        @Bean //Light Mode
        public  Bean_Two bean_two(){
        return new Bean_Two();
        }



}
