package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.controller.MainController;
import com.nt.vo.PatientVO;


public class RealtimeDITest {
	
	public static void main(String[] args) {
		
		String name=null,age=null,address=null,report=null,mobile=null,email=null; 
		Scanner s=null;
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		MainController Controller=null;
		//get scanner class obj
		s= new Scanner(System.in);
		
		//get input from Console
		System.out.println("Enter Patient Name::");
		name=s.next();
		System.out.println("Enter Patient Age::");
		age=s.next();
		System.out.println("Enter Patient Address::");
		address=s.next();
		System.out.println("Enter Corona Report::");
		report=s.next();
		System.out.println("Enter Patient Mobile::");
		mobile=s.next();
		System.out.println("Enter Patient Email::");
		email=s.next();
		
		
		PatientVO vo=null;
		//set value to VO class
		vo=new PatientVO();
		
		//get Spring bean class
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		
		//get controllere class 
		Controller=factory.getBean("controller", MainController.class);
		//invoke methods
		
		try {
		System.out.println(Controller.porcess(vo));	
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		s.close();
	}
}
