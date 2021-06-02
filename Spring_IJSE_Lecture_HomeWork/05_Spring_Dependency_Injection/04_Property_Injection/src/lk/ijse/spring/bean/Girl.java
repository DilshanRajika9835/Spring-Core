package lk.ijse.spring.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Girl implements GoodGirl{
    public Girl(){
        System.out.println("Girl Instantiated.....");
    }

    @Override
    public void chatWithGirl() {
        System.out.println(" Girl One Chat With my Boy....");
    }
}
