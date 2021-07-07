package lk.ijse.spring.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Girl_Two implements GoodGirl{
    public Girl_Two(){
        System.out.println("Girl_Two Instantiated.....");
    }

    @Override
    public void chatWithGirl() {
        System.out.println("Girl Two  Chat With my Boy....");
    }
}
