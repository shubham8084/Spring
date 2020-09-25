package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Voter;

public class BeansLifeCycleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=null;
		Voter voter=null,voter1=null;
		//craete IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
       voter=ctx.getBean("voter",Voter.class);
       //voter1=ctx.getBean("voter1", Voter.class);
       System.out.println(voter.CheckVotingEligiblity());
       //System.out.println(voter1.CheckVotingEligiblity());
       ((AbstractApplicationContext) ctx).close();
		
	}//main

}// class
