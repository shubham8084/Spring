package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.nt.comps.Flipkart;

public class StrategyDPTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Resource res = null;
		Flipkart fpkt = null;
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	
		// assign target class
		fpkt = ctx.getBean("fkt", Flipkart.class);
		System.out.println(
				fpkt.getInstant(new String[] { "Tv", "AC", "Refrigeter" }, new float[] { 20000, 18000, 15000 }));

	}

}
