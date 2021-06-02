package lk.ijse.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class Boy {


    //Caused by: org.springframework.beans.factory.NoUniqueBeanDefinitionException: No qualifying bean of type 'lk.ijse.spring.bean.GoodGirl' available: more than one 'primary' bean found among candidates: [girl_One, girl_Two]
    @Autowired
   // @Qualifier("girl_Two")    //if we use @Primary annotation use Girl_One & Girl_Two We Use this Annotation
    GoodGirl goodGirl;//property Injection

    public Boy(){
        System.out.println("Boy Instantiated.....");
    }
    public void ChatWithGirl(){
        goodGirl.chatWithGirl();
    }

}
