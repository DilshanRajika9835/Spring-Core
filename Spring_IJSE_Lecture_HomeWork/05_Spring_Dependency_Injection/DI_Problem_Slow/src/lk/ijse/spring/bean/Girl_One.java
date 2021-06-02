package lk.ijse.spring.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary//Slow problem Like this use annotation
// Exception-->No qualifying bean of type 'lk.ijse.spring.bean.GoodGirl

public class Girl_One implements GoodGirl{
    public Girl_One(){
        System.out.println("Girl_One Instantiated.....");
    }

    @Override
    public void chatWithGirl() {
        System.out.println(" Girl One Chat With my Boy....");
    }
}
