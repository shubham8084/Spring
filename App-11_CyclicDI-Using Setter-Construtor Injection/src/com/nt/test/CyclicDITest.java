package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.A;
import com.nt.beans.B;

public class CyclicDITest {

	public static void main(String[] args) {
		// varible declaration
		A obj1 = null;
		B obj2 = null;
		BeanFactory factory = null;

		// create IOC container
		factory = new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));
		/*
		 * //Assing A target class 
		 * obj1=factory.getBean("a1",A.class);
		 * System.out.println("CyclicDITest.main()::"+obj1.toString());
		 */

		// Assign B target class
		obj2 = factory.getBean("b1", B.class);
		System.out.println("CyclicDITest.main()::" + obj2.toString());

	}

}
