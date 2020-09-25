package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.StudentBean;

public class NameTest {

	public static void main(String[] args) {
		// varible declaration
StudentBean st=null;
BeanFactory factory=null;
		
//create ioc container
factory=new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));

//Assign target class
st=factory.getBean("stud",StudentBean.class);
System.out.println("NameTest.main()");
System.out.println(st.toString());

		
	}

}
