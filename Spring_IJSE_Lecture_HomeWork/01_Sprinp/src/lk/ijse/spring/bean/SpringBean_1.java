package lk.ijse.spring.bean;

import org.springframework.stereotype.Component;

@Component("a")  //bean id
//Genarate Bean ID using class name First letter simple
public class SpringBean_1 {
    SpringBean_1(){
        System.out.println("Spring Instantiated.....");
    }
    public void test(){
        System.out.println("test method invoked.....");
    }
}
