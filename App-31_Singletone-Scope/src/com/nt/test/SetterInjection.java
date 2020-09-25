package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.WishMessageGenerator;

public class SetterInjection {

	public static void main(String[] args) {
		System.out.println("SetterInjection.main()");
		DefaultListableBeanFactory factory = null;
		XmlBeanDefinitionReader reader = null;
		WishMessageGenerator msg1 = null, msg2 = null, msg3 = null;
		// Create IOC container
		factory = new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");

		msg1 = factory.getBean("msg", WishMessageGenerator.class);

		msg2 = factory.getBean("msg", WishMessageGenerator.class);

		msg3 = factory.getBean("msg", WishMessageGenerator.class);

		System.out.println(msg1.wishmsg("Raja") + " " + msg1.hashCode());

		System.out.println(msg2.wishmsg("Shyam") + " " + msg2.hashCode());

		System.out.println(msg3.wishmsg("Raju") + " " + msg3.hashCode());

	}

}
