package lk.ijse.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Bean_Three {
    @Autowired(required = false)
    public Bean_Three(@Value("C003") String id, @Value("Kamal") String name){
        System.out.println("Spring Bean Three  02_Parameterized Constructor Instantiated......");
        System.out.println(id+"[ ]"+name);
    }
    @Autowired(required = false) // If we have't Default Constructor
    // two or many parametrized constructor we should use this annotation
    // to a one Constructor
    public Bean_Three(@Value("C003") String id, @Value("Kamal") String name,@Value("Galle") String address){
        System.out.println("Spring Bean Three   03_Parameterized Constructor Instantiated......");

    }

    /*WARNING: Exception  Found constructor with 'required'
      Autowired annotation already: public lk.ijse.spring.bean.Bean_Three(java.lang.
      String,java.lang.String,java.lang.String)
      If we use There are two @Autowire Annotations we should required false lke this.
     */
    public Bean_Three(@Value("10000") double salary){
        System.out.println("Spring Bean Three   01_Parameterized Constructor Instantiated......");

    }
   /* public  Bean_One(){
        System.out.println("Spring Bean Three Default Constructor Instantiated......");
    }*/
}
