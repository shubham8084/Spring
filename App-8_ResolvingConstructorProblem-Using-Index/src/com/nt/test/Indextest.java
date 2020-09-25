package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.StudentBean;

public class Indextest {

	public static void main(String[] args) {
	  StudentBean std=null;
		BeanFactory  factory=null;
		//create IOC container
		factory=new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));
		
		//instae target class
		std=factory.getBean("std",StudentBean.class);
		System.out.println("Indextest.main()");
		System.out.println(std.toString());
		
		
		
		

	}

}
