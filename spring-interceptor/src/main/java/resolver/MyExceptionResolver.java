package resolver;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyExceptionResolver implements HandlerExceptionResolver {

        /*
           参数Exception:异常对象
           返回值ModelAndView:跳转的错误视图信息
        */
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {

        ModelAndView modelAndView = new ModelAndView();

        if(e instanceof ClassCastException) {
            modelAndView.addObject("info","属性转换一场");
        } else if (e instanceof RuntimeException) {
            modelAndView.addObject("info","运行异常");
        }

        modelAndView.setViewName("error");

        return modelAndView;
    }
}
