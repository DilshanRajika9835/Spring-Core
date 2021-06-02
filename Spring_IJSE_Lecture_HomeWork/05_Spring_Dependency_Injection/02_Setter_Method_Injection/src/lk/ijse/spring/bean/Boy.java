package lk.ijse.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Boy {
    GoodGirl goodGirl;
    public Boy(){
        System.out.println("Boy Instantiated.........");
    }
    @Autowired
    public void setGoodGirl(GoodGirl goodGirl){
        this.goodGirl=goodGirl;
    }
    public void chatWithGirl(){
        goodGirl.chatGoodGirl();
    }

}
