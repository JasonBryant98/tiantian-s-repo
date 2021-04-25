package listener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextLoaderListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        //将Spring的应用上下文对象存储到ServletContext域中
        ServletContext servletContext = servletContextEvent.getServletContext();
        servletContext.setAttribute("app",app);

    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
