package lk.ijse.spring.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Spring_Bean_Three {
    public  Spring_Bean_Three(){
        System.out.println("Spring Bean Three Instantiated........");
    }
    @Bean
    public  Bean_One bean_one(){
        final Bean_Two bean_two1 = bean_two();
        System.out.println(bean_two1);//lk.ijse.spring.bean.Bean_Two@1dd92fe2
        final Bean_Two bean_two2 = bean_two();
        System.out.println(bean_two2);//lk.ijse.spring.bean.Bean_Two@6b53e23f
        return new Bean_One();
    }
    @Bean
    public  Bean_Two bean_two(){
        return new Bean_Two();
    }
}
