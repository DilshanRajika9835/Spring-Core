package lk.ijse.spring.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Bean_One {
    /* No qualifying bean of type 'java.lang.String' available:
      expected at least 1 bean which qualifies as autowire candidate. Dependency annotations: {}

     public  Bean_One(String id, String name){
         System.out.println("Spring Bean One Parameterized Constructor Instantiated......");
         System.out.println(id+"[ ]"+name);
     }
     */
    public  Bean_One(@Value("C001") String id,@Value("Name") String name){
        System.out.println("Spring Bean One Parameterized Constructor Instantiated......");
        System.out.println(id+"[ ]"+name);
    }
   /* public  Bean_One(){
        System.out.println("Spring Bean One Default Constructor Instantiated......");
    }*/
}
