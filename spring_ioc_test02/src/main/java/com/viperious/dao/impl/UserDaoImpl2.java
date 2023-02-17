package com.viperious.dao.impl;

import com.viperious.dao.UserDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository(value = "userDao2")
@Primary
public class UserDaoImpl2 implements UserDao {

    @Override
    public void show() {

    }

}
