package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @RequestMapping("/quick")
    public String save() {
        System.out.println("Controller save running...");
        //加"/"是为了访问外部success的文件
        return "success";
    }

    @RequestMapping("/quick2")
    public ModelAndView save2(){
        /*
            Model:模型 作用：封装数据
            View:视图  作用：展示数据
         */
        ModelAndView modelAndView = new ModelAndView();
        // 设置模型数据
        modelAndView.addObject("username","it");
        // 设置视图名称
        modelAndView.setViewName("success");

        return modelAndView;
    }
}
