package com.nt.service;

import com.nt.bo.CoustomerBO;
import com.nt.dao.CoustomerDAO;
import com.nt.dto.CoustomerDTO;

public class CoustomerServiceImpl implements CoustomerService {
       private CoustomerDAO dao=null;
       
	
	public CoustomerServiceImpl(CoustomerDAO dao) {
		
		this.dao = dao;
	}
	@Override
	public String CalculateIntrest(CoustomerDTO dto) throws Exception {
	    float Intrest=0.0f;
	    int count=0;
		Intrest=(dto.getPamt()*dto.getRate()*dto.getTime())/100;
		 
		CoustomerBO bo=null;
		//get BO cls object
		bo=new CoustomerBO();
		bo.setCname(dto.getCname());
		bo.setCadd(dto.getCadds());
		bo.setPamt(dto.getPamt());
		bo.setIntrest(Intrest);
		// invoke DAO class method
		count=dao.insertDAO(bo);
		
		if (count==0)
			return "Internal problem try again";
		else
		return "Record Inserted in DB";
	}

}
