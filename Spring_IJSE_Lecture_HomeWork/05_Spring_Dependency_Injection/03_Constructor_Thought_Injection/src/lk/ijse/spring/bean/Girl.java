package lk.ijse.spring.bean;

import org.springframework.stereotype.Component;

@Component
public class Girl implements GoodGirl{
    @Override
    public void GoodGirl() {
        System.out.println("Girl One Chat with Boy..");
    }
}
