package com.nt.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.controller.MainController;
import com.nt.vo.EmployeeVO;



public class NestedContainerTest {

	public static void main(String[] args) {
		ApplicationContext parentsCtx = null, childCtx = null;
		MainController controller = null;
		List<EmployeeVO> listVO = null;

		// create Parent IOC Container
		parentsCtx = new ClassPathXmlApplicationContext("com/nt/cfgs/business-beans.xml");
		// create child IOC Conatiner
		childCtx = new ClassPathXmlApplicationContext(new String[] { "com/nt/cfgs/presetation-beans.xml" }, parentsCtx);
		// get container instantions
		controller = childCtx.getBean("controller", MainController.class);
		System.out.println(controller.toString());
		// calls Method
		try {
			
			listVO = controller.getherEmpByDesg("clerk", "developer","manager");
			
			// display result
			for (EmployeeVO vo : listVO)

				System.out.println(vo.getEno()+" "+vo.getEname()+" "+vo.getSalary()+" "+vo.getDesg()+" "+vo.getDeptno()+" "+vo.getSeriallNo());
			

		} // try
		catch (Exception e) {
			
			e.printStackTrace();
		} // catch

		
		//close container
		((AbstractApplicationContext) parentsCtx).close();
		((AbstractApplicationContext)  childCtx).close();
	}//main

}
