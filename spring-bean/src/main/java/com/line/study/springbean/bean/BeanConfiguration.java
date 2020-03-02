package com.line.study.springbean.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean(initMethod = "initMethod",destroyMethod = "destroyMethod")
    public BeanLife beanLife(){
        return  new BeanLife();
    }

}
