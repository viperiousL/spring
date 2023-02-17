package com.viperious;

import com.viperious.beans.OtherBean2;
import com.viperious.config.SpringConfig;
import com.viperious.dao.UserDao;
import com.viperious.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.ParseException;

public class ApplicationContextTest {
    public static void main(String[] args) {
        //xml方式的spring容器
//        ClassPathXmlApplicationContext applicationContext= new ClassPathXmlApplicationContext("applicationContext.xml");
//        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
//        System.out.println(userDao);
//        userDao.show();
//        UserService userService = applicationContext.getBean(UserService.class);
//        System.out.println(userService);
//        userService.show();
//        applicationContext.close();
//        Object dataSource = applicationContext.getBean("dataSource");
//        System.out.println(dataSource);
//        System.setProperty("spring.profiles.active","test");
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
//        Object userDao = applicationContext.getBean("userDao");
//        System.out.println(userDao);
//        Object userDao2 = applicationContext.getBean("userDao2");
//        System.out.println(userDao2);
//        Object dataSource = applicationContext.getBean("dataSource");
//        System.out.println(dataSource);
//        UserService userService = (UserService) applicationContext.getBean("userService");
//        System.out.println(userService);
//        userService.show();
        OtherBean2 bean = applicationContext.getBean(OtherBean2.class);
        System.out.println(bean);

    }
}
