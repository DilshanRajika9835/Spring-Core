package lk.ijse.spring.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class Bean_Two {
  /*  public Bean_Two(){
        System.out.println("Spring Bean Two instantiated....");
    }*/
    public Bean_Two(@Value("Kamal,Nimal,Piyal,Ravidhu") String name[],@Value("C002") String id){
        System.out.println("Spring Bean Two Parameterized Constructor  instantiated....");
        for (String names :name) {
            System.out.println(names);
        }
    }


}
