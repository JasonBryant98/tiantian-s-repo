package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping("/quick")
    public String save() {
        System.out.println("Controller save running...");
        //加"/"是为了访问外部success的文件
        return "success";
    }
}
