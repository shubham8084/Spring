package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.WishMessageGenerator;

public class SetterInjection {

	public static void main(String[] args) {
		System.out.println("SetterInjection.main()");
		// declared varibles
		Resource res = null;
		BeanFactory factory = null;
		WishMessageGenerator target = null;

		// HOld the location spring bean cfg file in resource object
		res = new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");

		// crete IOC Container/Spring Container
		factory = new XmlBeanFactory(res);

		// get target bean class obj from bean factory container

		Object obj = factory.getBean("wmg");

		target = (WishMessageGenerator) obj;

		String result = target.wishmsg("Shubham");
		System.out.println(result);

	}

}
