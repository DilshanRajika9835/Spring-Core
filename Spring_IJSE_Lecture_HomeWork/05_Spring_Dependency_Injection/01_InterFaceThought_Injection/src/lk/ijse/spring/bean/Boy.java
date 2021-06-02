package lk.ijse.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Boy implements DI {
    Girl girl;
    public Boy(){

        System.out.println("Boy Instantiated....");
    }
    @Autowired//Interface Thought injection
    @Override
    public void goodGirl(Girl girl) {
        this.girl=girl;
    }
    public  void chatWithGirl(){
        girl.chatBoy();
    }
}
