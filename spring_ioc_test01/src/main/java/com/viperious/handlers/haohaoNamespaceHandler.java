package com.viperious.handlers;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class haohaoNamespaceHandler extends NamespaceHandlerSupport {
    @Override
    public void init() {
        //初始化,一般情况下,一个命名空间下有多个标签,会在init方法中为每一个标签注册一个标签解析器
        this.registerBeanDefinitionParser("annotation-driven",new HaohaoBeanDefinitionParser());
    }
}
