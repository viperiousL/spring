package com.viperious.dao.impl;

import com.viperious.dao.UserDao;
import com.viperious.service.UserService;
import org.springframework.beans.factory.InitializingBean;

public class UserDaoImpl implements UserDao {
    private UserService userService;

    public void setUserService(UserService userService) {
//        System.out.println("userDao执行注入userService的操作:setUserService方法执行");
        this.userService = userService;
    }

    public UserDaoImpl() {
//        System.out.println("userDao创建");
    }

    @Override
    public void show() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("show....");
    }
//    private String userName;
//
//    public void setUserName(String userName) {
//        this.userName = userName;
//    }
//
//    public UserDaoImpl() {
//        System.out.println("userDao实例化");
//    }
//
//    public void init(){
//        System.out.println("init初始化方法执行...");
//    }

//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("属性设置之后执行...");
//    }
}
