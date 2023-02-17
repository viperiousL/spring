package com.viperious.factory;

import com.viperious.dao.UserDao;
import com.viperious.dao.impl.UserDaoImpl;

public class MyBeanFactory2 {

    public UserDao userDao(String username){
        return new UserDaoImpl();
    }

}
