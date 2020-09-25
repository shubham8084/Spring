package com.nt.replacer;

import java.lang.reflect.Method;

public class BankSimpleIntrest implements org.springframework.beans.factory.support.MethodReplacer {

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("BankSimpleIntrest.reimplement()");
		float pAmt=0.0f;
		float rate=0.0f;
		float time=0.0f;
		
		//get value of pAmt, rate And Time
		pAmt=(float) args[0];
		rate=(float) args[1];
		time=(float) args[2];
		return (pAmt*rate*time)/100.0f;
	}

}
