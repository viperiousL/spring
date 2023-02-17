package com.viperious.factory;

import com.viperious.dao.UserDao;
import com.viperious.dao.impl.UserDaoImpl;
import org.springframework.beans.factory.FactoryBean;

public class MyBeanFactory3 implements FactoryBean<UserDao> {

    @Override
    public UserDao getObject() throws Exception {
        System.out.println("getObject被调用...");
        return new UserDaoImpl();
    }

    @Override
    public Class<?> getObjectType() {
        return UserDao.class;
    }
}
