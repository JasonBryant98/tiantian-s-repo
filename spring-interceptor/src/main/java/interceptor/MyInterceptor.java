package interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyInterceptor implements HandlerInterceptor {

    // 在目标方法执行之前执行
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("preHandle...");

        String param = request.getParameter("param");
        if(param.equals("yes")) {
            return true;// 返回true代表放行 返回false代表不放行
        } else {
            request.getRequestDispatcher("/error.jsp").forward(request,response);
            return false;
        }
    }

    // 在目标方法执行之后，视图返回之前执行
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        modelAndView.addObject("name","liuliu");// 将视图修改为liuliu
        System.out.println("postHandle...");
    }

    // 在整个流程都执行完毕后，执行
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
