package com.spring.beanlifecycle.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.spring.beanlifecycle")
public class JavaConfig {
	@Bean(initMethod="customInit",destroyMethod="customDestroy",name="student")
	public Student getInstance(){
		return new Student();
	}
}
