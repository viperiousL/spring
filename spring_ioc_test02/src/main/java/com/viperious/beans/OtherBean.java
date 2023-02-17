package com.viperious.beans;

import com.alibaba.druid.pool.DruidDataSource;
import com.viperious.dao.UserDao;
import com.viperious.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.sql.DataSource;

//@Component
public class OtherBean {

    @Bean("dataSource") //默认根据方法名获取Bean
    public DataSource dataSource(
            @Value("${jdbc.driver}") String driverClassName,
            @Autowired UserDao userDao,
            @Qualifier("userDao2") UserDao userDao2,
            UserService userService){
//        System.out.println(driverClassName);
//        System.out.println(userDao);
//        System.out.println(userDao2);
//        System.out.println(userService);//在参数中引用类型无需使用@Autowired
        DruidDataSource dataSource = new DruidDataSource();
        //设置4个基本参数...
//        dataSource.setDriverClassName(driverClassName);

        return  dataSource;
    }

}
