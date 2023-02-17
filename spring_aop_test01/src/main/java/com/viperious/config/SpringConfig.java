package com.viperious.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("com.viperious")//<context:component-scan base-package="com.viperious"/>
@EnableAspectJAutoProxy//<aop:aspectj-autoproxy/>
public class SpringConfig {
}
