package com.hostmdy.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import ch.qos.logback.core.spi.ContextAware;

@Component /*("testBean")*/
public class BeanLifeCyceTest implements InitializingBean,
DisposableBean,BeanNameAware, ApplicationContextAware, BeanFactoryAware
{
	
	public BeanLifeCyceTest() {
		// TODO Auto-generated constructor stub
		System.out.println("###Bean is started Instantiate###");
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("###Bean Object is set into Bean Factory###");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("###Notified Out Bean to Application Context Container");
	}

	@Override
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		System.out.println("###Bean Name : "+name+" is set.###");
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("###Bean is destoryed###");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("###All Properties are set into bean object.###");
	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("###Bean is constructed.###");
	}
	
	@PreDestroy
	public void preDestory() {
		System.out.println("###Bean is about to destory ###");
	}
	
	public void beforeInitialize() {
		System.out.println("### Before Bean is initialized ###");
	}
	
	public void afterInitialize() {
		System.out.println("### After Bean is initialized ###");
	}

}


