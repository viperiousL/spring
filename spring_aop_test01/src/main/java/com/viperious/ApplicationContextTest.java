package com.viperious;

import com.viperious.config.SpringConfig;
import com.viperious.dao.UserDao;
import com.viperious.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextTest {

    public static void main(String[] args) {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        UserService userService = applicationContext.getBean(UserService.class);
//        userService.show1();
//        userService.show2();
//        userService.show3();
//        UserDao userDao = applicationContext.getBean(UserDao.class);
//        userDao.show();
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext3.xml");
//        UserService userService = applicationContext.getBean(UserService.class);
//        userService.show1();
//        userService.show2();
        ApplicationContext app = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService bean = app.getBean(UserService.class);
        bean.show2();

    }

}
