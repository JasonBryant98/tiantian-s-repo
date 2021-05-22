package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TargetController {

    @RequestMapping("/target")
    public ModelAndView show(){
        System.out.println("目标自愿执行...");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name","tiantian");
        modelAndView.setViewName("index");
        return modelAndView;
    }
}
