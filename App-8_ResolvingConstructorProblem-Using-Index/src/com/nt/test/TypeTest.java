package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.StudentBean;

public class TypeTest {

	public static void main(String[] args) {
		// varible declaration
StudentBean stud=null;
BeanFactory factory=null;
		
//create ioc container
factory=new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));

//Assign target class
stud=factory.getBean("stud",StudentBean.class);
System.out.println("TypeTest.main()");
System.out.println(stud.toString());

		
	}

}
