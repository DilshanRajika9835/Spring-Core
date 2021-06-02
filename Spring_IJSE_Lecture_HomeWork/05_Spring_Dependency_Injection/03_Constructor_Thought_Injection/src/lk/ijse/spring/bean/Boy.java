package lk.ijse.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class Boy {
    GoodGirl goodGirl;

    @Autowired//Constructor Injection
    public Boy(GoodGirl goodGirl){
        this.goodGirl=goodGirl;
        System.out.println("Boy Instantiated.....");
    }

    public void ChatWithGirl(){
        goodGirl.GoodGirl();


}
}
