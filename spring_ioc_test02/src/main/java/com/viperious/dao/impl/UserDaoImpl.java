package com.viperious.dao.impl;

import com.viperious.dao.UserDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Repository(value = "userDao")
@Scope("singleton")
@Lazy(true)
//@Profile("test")
public class UserDaoImpl implements UserDao {
//    @Value("zhangsan")
    @Value("${jdbc.driver}")
    private String username;

//    @Value("lisi")
    public void setUsername(String username){
        this.username=username;
    }

    @Override
    public void show() {
        System.out.println(username);
    }

//    public UserDaoImpl() {
//        System.out.println("userDao创建...");
//    }
//
//    @PostConstruct
//    public void init(){
//        System.out.println("userDao的初始化方法");
//    }
//
//    @PreDestroy
//    public void destroy(){
//        System.out.println("userDao的销毁方法");
//    }
}
