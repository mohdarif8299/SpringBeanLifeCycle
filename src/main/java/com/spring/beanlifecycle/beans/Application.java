package com.spring.beanlifecycle.beans;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
public class Application {
	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		//context.registerShutdownHook();
	}
}
