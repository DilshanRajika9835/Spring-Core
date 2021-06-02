package lk.ijse.spring.bean;

import org.springframework.stereotype.Component;

@Component
public class Girl {

    public Girl(){
        System.out.println("Girl  Instantiated....");
    }
    public void chatBoy(){
        System.out.println("Chat With Boy.....");

    }
}
