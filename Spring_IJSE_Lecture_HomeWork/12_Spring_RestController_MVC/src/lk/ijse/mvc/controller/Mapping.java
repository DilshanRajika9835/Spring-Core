package lk.ijse.mvc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/mapping")
public class Mapping {
    @GetMapping("/c/??1")
    // api/v1/mapping/c/231
    public String addItem1(){
        return"Add Item 1";
    }
    @GetMapping("/c/??")
    // api/v1/mapping/c/23
    public String addItem2(){
        return"Add Item 2";
    }
    @GetMapping("/c/*/123")
    // api/v1/mapping/c/erd/123
    public String addItem3(){
        return"Add Item 3";
    }
    @GetMapping("/c/*/*/123")
    // api/v1/mapping/c/abs/cdc/der/123
    public String addItem(){
        return"Add Item 4";
    }
}
