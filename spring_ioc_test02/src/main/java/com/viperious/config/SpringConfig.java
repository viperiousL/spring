package com.viperious.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.viperious.anno.MyMapperScan;
import com.viperious.beans.OtherBean;
import com.viperious.beans.OtherBean2;
import com.viperious.imports.MyImportBeanDefinitionRegistrar;
import com.viperious.imports.MyImportSelector;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;

@Configuration  //标注当前类是一个配置类(替代配置文件)+@Component
@ComponentScan("com.viperious") //<context:component-scan base-package="com.viperious"/>
@PropertySource("classpath:jdbc.properties") //<context:property-placeholder location="classpath:jdbc.properties"/>
//@Import(OtherBean.class)
//@Import(MyImportSelector.class)
//@Import(MyImportBeanDefinitionRegistrar.class)
@MapperScan("com.viperious.mapper")
@MyMapperScan
public class SpringConfig {

    @Bean
    public DataSource dataSource(
            @Value("${jdbc.driver}") String driver,
            @Value("${jdbc.url}") String url,
            @Value("${jdbc.username}") String username,
            @Value("${jdbc.password}") String password
    ){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driver);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }

    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource){
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        return sqlSessionFactoryBean;
    }

}
