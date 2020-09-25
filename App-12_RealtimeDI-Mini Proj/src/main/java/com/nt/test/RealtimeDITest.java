package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.controller.MainController;
import com.nt.vo.CoustomerVO;

public class RealtimeDITest {
	
	public static void main(String[] args) {
		
		String name=null,cadd=null,PAmount=null,rate=null,time=null; 
		Scanner s=null;
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		MainController controller=null;
		//get scanner class obj
		s= new Scanner(System.in);
		
		//get input from Console
		System.out.println("Enter Customer Name::");
		name=s.next();
		System.out.println("Enter Customer Addres::");
		cadd=s.next();
		System.out.println("Enter PAmount::");
		PAmount=s.next();
		System.out.println("Enter intrest Rate::");
		rate=s.next();
		System.out.println("Enter Time in Month::");
		time=s.next();
		
		CoustomerVO vo=null;
		//get VO class obj
		vo=new CoustomerVO();
		
		//set value to VO class
		vo.setCname(name);
		vo.setCadd(cadd);
		vo.setPamt(PAmount);
		vo.setRate(rate);
		vo.setTime(time);
		
		//get Spring bean class
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
	reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get controllere class 
		controller=ctx.getBean("controller", MainController.class);
		//invoke methods
		try {
		System.err.println(controller.processCoustomer(vo));	
		}catch(Exception e) {
			e.printStackTrace();
		}
	
		s.close();
	}
}
