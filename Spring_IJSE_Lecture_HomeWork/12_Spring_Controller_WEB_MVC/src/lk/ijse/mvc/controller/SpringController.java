package lk.ijse.mvc.controller;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Component
@Controller
@RequestMapping("/spring")
public class SpringController {
    @GetMapping
    public ModelAndView test(){
        return new ModelAndView("/customer");

    }
}
