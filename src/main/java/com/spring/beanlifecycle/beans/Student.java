package com.spring.beanlifecycle.beans;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
public class Student implements InitializingBean,DisposableBean {
	private String name;
	public Student() {
		System.out.println("Constructor Invoked");
	}
	@PostConstruct
	public void  settingProperties() {
		this.name = "Lucky";
		System.out.println("Inside post construct properties set");
		System.out.println("Name is:  "+this.name);
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside after properties set method");
		System.out.println("Name is "+this.name);
	}
	public void customInit(){
		this.name = null;
		System.out.println("Inside Custom init");
		System.out.println("Name is "+this.name);
	}
	public String getName() {
		return name;
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("Inside destroy method");
	}
	@PreDestroy
	public void myDestroy(){
		System.out.println("Inside my destroy");
	}
	public void customDestroy(){
		System.out.println("Inside custom destroy");
	}
}