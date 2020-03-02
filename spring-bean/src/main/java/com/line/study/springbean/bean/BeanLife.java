package com.line.study.springbean.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**bean声明周期*/
public class BeanLife implements  InitializingBean,BeanPostProcessor ,DisposableBean{

    public BeanLife() {
        System.out.println("init--------------------------------------------------------------------------------------------------");
    }

    @PostConstruct//由java提供,并非spring
    public void postConstruct() {
        System.out.println("@postConstruct");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("initializingBean.afterPropertiesSet");
    }

    public void initMethod() {
        System.out.println("bean-(initmethod)");
    }

    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("BeanPostProcessor.postProcessBeforeInitialization");
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("BeanPostProcessor.postprocessAfterInitialization");
        return o;
    }


    @PreDestroy //由java提供,并非spring
    public void destoryMethod() {
        System.out.println("@preDestrpy");
    }


    @Override
    public void destroy() throws Exception {
        System.out.println("disposableBean.destory");
    }


    public void destroyMethod() {
        System.out.println("bean-(destoryMethod)");
    }


}