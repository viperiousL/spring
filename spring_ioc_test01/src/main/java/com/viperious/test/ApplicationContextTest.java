package com.viperious.test;

import com.alibaba.druid.pool.DruidDataSource;
import com.viperious.beans.OtherBean;
import com.viperious.beans.XxxBean;
import com.viperious.dao.PersonDao;
import com.viperious.dao.UserDao;
import com.viperious.service.UserService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ApplicationContextTest {
    public static void main(String[] args) throws ParseException, Exception {
//        System.setProperty("spring.profiles.active","test");
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");//beanName
        userService.show();
//        UserService userService = (UserService) applicationContext.getBean("userService");//beanName
        //UserService userService = (UserService) applicationContext.getBean("com.viperious.com.viperious.service.impl.UserServiceImpl");//beanName
//        System.out.println(userService);
//        applicationContext.close();
//        UserService userService = (UserService) applicationContext.getBean("userService");
//        UserService userService1 = applicationContext.getBean("userService",UserService.class);
//        UserService userService2 = applicationContext.getBean(UserService.class);
//        UserDao userDao = (UserDao) applicationContext.getBean("xxx");
//        System.out.println(userService2);
//        System.out.println(userDao);

//        Object dataSource = applicationContext.getBean("dataSource");
//        System.out.println(dataSource);

//        Class.forName("com.mysql.jdbc.Driver");
//        DriverManager.getConnection("", "", "");
//        Object connection = applicationContext.getBean("connection");
//        System.out.println(connection);

//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Date date = simpleDateFormat.parse("2023-01-05 22:38:50");
//        Object date = applicationContext.getBean("date");
//        System.out.println(date);
//        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
//        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
//        SqlSessionFactory sqlSessionFactory = builder.build(in);
//        SqlSessionFactory sqlSessionFactory = (SqlSessionFactory) applicationContext.getBean("sqlSessionFactory");
//        System.out.println(sqlSessionFactory);
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//        System.out.println(sqlSession);
//        OtherBean otherBean = applicationContext.getBean(OtherBean.class);
//        System.out.println(otherBean);
//        XxxBean xxxBean = applicationContext.getBean(XxxBean.class);
//        System.out.println(xxxBean);
//        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
//        userDao.show();

    }
}
