package com.spring.beanlifecycle.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;
@Component
public class BeanProcessor  implements BeanPostProcessor{
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Inside bean after initialization method");
		if(bean instanceof Student) {
			Student student  = (Student)bean;
			System.out.println("Name is "+student.getName());
			System.out.println("Bean name is "+beanName.getClass().getName());
			return bean;
		}
		else {
		    System.out.println("Name of Bean is"+beanName.getClass().getName());
		    return bean;
		}
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Inside bean beforeinitialization method");
		if(bean instanceof Student) {
			Student student  = (Student)bean;
			System.out.println("Name is "+student.getName());
			System.out.println("Bean name is "+beanName.getClass().getName());
			return bean;
		}
		else {
		    System.out.println("Name of Bean is"+beanName.getClass().getName());
		    return bean;
		}
	}

}
