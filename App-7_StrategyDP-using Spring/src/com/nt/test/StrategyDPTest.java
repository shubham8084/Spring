package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.nt.comps.Flipkart;

public class StrategyDPTest {

	public static void main(String[] args) {
		BeanFactory factory = null;
		Resource res = null;
		Flipkart fpkt = null;
		// loacte cfg file path
		res = new ClassPathResource("com/nt/cfgs/applicationContext.xml");
		// create obj
		factory = new XmlBeanFactory(res);
		// assign target class
		fpkt = factory.getBean("fkt", Flipkart.class);
		System.out.println(
				fpkt.getInstant(new String[] { "Tv", "AC", "Refrigeter" }, new float[] { 20000, 18000, 15000 }));

	}

}
