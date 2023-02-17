package com.viperious.handlers;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.beans.factory.xml.BeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

public class HaohaoBeanDefinitionParser implements BeanDefinitionParser {
    @Override
    public BeanDefinition parse(Element element, ParserContext parserContext) {
        //注入一个BeanProcessor
        BeanDefinition beanDefinition = new RootBeanDefinition();
        beanDefinition.setBeanClassName("com.viperious.processor.HaohaoBeanPostProcessor");
        parserContext.getRegistry().registerBeanDefinition("haohaoBeanPostProcessor",beanDefinition);
        return beanDefinition;
    }
}
