package com.viperious.service.impl;

import com.viperious.dao.UserDao;
import com.viperious.mapper.UserMapper;
import com.viperious.pojo.User;
import com.viperious.service.UserService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.context.ServletContextAware;

import javax.servlet.ServletContext;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class UserServiceImpl implements UserService, InitializingBean , ServletContextAware ,
        ApplicationContextAware, BeanFactoryAware, BeanNameAware {

    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public UserServiceImpl() {
//        System.out.println("userService创建");
    }

    private UserDao userDao;

    private String userName;

    public void setUserName(String userName) {
        this.userName = userName;
    }
    //    private List<String> stringList;
//    public void setStringList(List<String> stringList) {
//        this.stringList = stringList;
//    }
//
//    private List<UserDao> userDaoList;
//    public void setUserDaoList(List<UserDao> userDaoList) {
//        this.userDaoList = userDaoList;
//    }
//
//    private Set<String> stringSet;
//    public void setStringSet(Set<String> stringSet) {
//        this.stringSet = stringSet;
//    }
//
//    private Set<UserDao> userDaoSet;
//    public void setUserDaoSet(Set<UserDao> userDaoSet) {
//        this.userDaoSet = userDaoSet;
//    }
//
//    private Map<String,UserDao> map;
//    public void setMap(Map<String, UserDao> map) {
//        this.map = map;
//    }
//
//    private Properties properties;
//
//    public void setProperties(Properties properties) {
//        this.properties = properties;
//    }

    public void show(){
//        System.out.println(stringList);
//        System.out.println(userDaoList);
//        System.out.println(stringSet);
//        System.out.println(userDaoSet);
//        System.out.println(map);
//        System.out.println(properties);
//        System.out.println(userDao);
        List<User> all = userMapper.findAll();
        for (User user : all) {
            System.out.println(user);
        }
    }
    //    public UserServiceImpl() {
//        System.out.println("UserServiceImpl无参构造");
//    }
//
//    public UserServiceImpl(String name) {
//        System.out.println("UserServiceImpl有参构造"+name);
//    }

    //BeanFactory去调用该方法 从容器中获得userDao设置到此处
    public void setUserDao(UserDao userDao){
//        System.out.println("BeanFactory去调用该方法获得userDao设置到此处"+userDao);
//        System.out.println("userService执行注入userDao的操作:setUserDao方法执行");
        this.userDao = userDao;
    }

//    public void init(){
//        System.out.println("初始化方法...");
//    }

//    public void destroy(){
//        System.out.println("销毁方法...");
//    }

    @Override
    public void afterPropertiesSet() throws Exception {
//        System.out.println("afterPropertiesSet执行...");
    }

    @Override
    public void setServletContext(ServletContext servletContext) {
        System.out.println(servletContext);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println(applicationContext);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println(beanFactory);
    }

    @Override
    public void setBeanName(String beanName) {
        System.out.println(beanName);
    }
}
