package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.WishMessageGenerator;

public class ConstructorInjection {

	public static void main(String[] args) {
		
		Resource res=null;
		BeanFactory factory=null;
		WishMessageGenerator target=null;
		//hold the loction of spring beans class
//		res= new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");
		
		res=new ClassPathResource("com/nt/cfgs/applicationContext.xml");
				
		//Create IOC Spring Container
		factory= new XmlBeanFactory(res);
		
		//get target class 
		//target=(WishMessageGenerator)factory.getBean("wmg");
		target=factory.getBean("wmg", WishMessageGenerator.class);
		
		
		//print output
		System.out.println(target.wishmsg("Shubham"));
		System.out.println(target.year());
	}

}
