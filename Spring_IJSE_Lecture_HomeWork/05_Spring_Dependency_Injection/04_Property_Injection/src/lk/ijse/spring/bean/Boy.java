package lk.ijse.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Boy {
    @Autowired
    GoodGirl goodGirl;//property Injection

    public Boy(){
        System.out.println("Boy Instantiated.....");
    }
    public void ChatWithGirl(){
        goodGirl.chatWithGirl();
    }

}
