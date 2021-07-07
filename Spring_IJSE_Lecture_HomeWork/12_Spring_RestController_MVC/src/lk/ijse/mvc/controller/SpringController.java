package lk.ijse.mvc.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/customer")
public class SpringController {
    @GetMapping
    public String getCustomer(){
    return "Get CustomerInvoke";
    }
    @PostMapping
    public String saveCustomer(){
        return "save CustomerInvoke";
    }
    @PutMapping
    public String updateCustomer(){
        return "Update CustomerInvoke";
    }
    @DeleteMapping
    public String deleteCustomer(){
        return "Delete CustomerInvoke";
    }
}
