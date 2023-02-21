package com.viperious.listener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextLoaderListener implements ServletContextListener {

    private String CONTEXT_CONFIG_LOCATION = "contextConfigLocation";

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("ContextLoaderListener init...");
        ServletContext servletContext = sce.getServletContext();
        //0、获取contextConfigLocation配置文件名称
        String contextConfigLocation = servletContext.getInitParameter(CONTEXT_CONFIG_LOCATION);
        //解析出配置文件的名称
        contextConfigLocation = contextConfigLocation.substring("classpath:".length());
        //1、创建Spring容器
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2、将容器存储到servletContext域中
        servletContext.setAttribute("applicationContext",app);
    }
}
