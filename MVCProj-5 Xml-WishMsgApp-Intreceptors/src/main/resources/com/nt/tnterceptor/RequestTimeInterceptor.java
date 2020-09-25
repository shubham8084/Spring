package com.nt.tnterceptor;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;

public class RequestTimeInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handler) throws Exception {
	RequestDispatcher rd=null;
		var hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		if (hour > 9 && hour < 17)
			return true;
		//if
		else
		{  
			rd=req.getRequestDispatcher("timeout.jsp"); 
			rd.forward(req, res);
			return false;
		}//else
	}
}
