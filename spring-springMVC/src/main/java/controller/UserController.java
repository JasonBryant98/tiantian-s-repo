package controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

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

    @ResponseBody // 告知springMVC框架 不进行视图跳转，直接进行数据响应
    @RequestMapping("/quick7")
    public String save7() throws IOException {
        return "hello";
    }

    @ResponseBody
    @RequestMapping("/quick9")
    public String save9() throws IOException {
        User user = new User();
        user.setUsername("lisi");
        user.setAge(30);
        // 使用json的转换工具将对象转换成json格式的字符串再返回
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(user);
        return json;
    }
}
