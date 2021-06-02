package lk.ijse.spring.bean;

import org.springframework.stereotype.Component;

@Component
public class Girl implements GoodGirl{
    public Girl(){
        System.out.println("Girl Instantiated.........");
    }
    @Override
    public void chatGoodGirl() {
        System.out.println("Chat With Girl .........");
    }
}
