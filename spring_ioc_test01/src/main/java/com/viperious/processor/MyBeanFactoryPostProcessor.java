package com.viperious.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("beanDefinitionMap填充完毕后回调该方法");
        //修改某个BeanDefinition
//        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("userService");
//        beanDefinition.setBeanClassName("com.viperious.dao.impl.UserDaoImpl");
        //注册某个BeanDefinition
//        BeanDefinition beanDefinition = new RootBeanDefinition();
//        beanDefinition.setBeanClassName("com.viperious.dao.impl.PersonDaoImpl");
//        DefaultListableBeanFactory defaultListableBeanFactory = (DefaultListableBeanFactory) beanFactory;
//        defaultListableBeanFactory.registerBeanDefinition("personDao",beanDefinition);
        System.out.println("MyBeanFactoryPostProcessor的postProcessBeanFactory");
    }
}
