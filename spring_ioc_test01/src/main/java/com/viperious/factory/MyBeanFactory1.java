package com.viperious.factory;

import com.viperious.dao.UserDao;
import com.viperious.dao.impl.UserDaoImpl;

public class MyBeanFactory1 {

    public static UserDao userDao(String name,int age){
        return new UserDaoImpl();
    }

}
