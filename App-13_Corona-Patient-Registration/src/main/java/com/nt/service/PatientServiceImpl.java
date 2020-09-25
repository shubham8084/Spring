package com.nt.service;

import com.nt.bo.PatientBO;
import com.nt.dao.PatientDAO;
import com.nt.dto.PatientDTO;

public class PatientServiceImpl implements PatientService {
private PatientDAO dao;

	public PatientServiceImpl(PatientDAO dao) {

	this.dao = dao;
}

	@Override
	public String processReport(PatientDTO dto) throws Exception {
	int count=0;
		PatientBO bo=null;
		//get bo class obj
		bo=new PatientBO();
		//set value to BO class from DTO class
		bo.setPname(dto.getName());
		bo.setAge(dto.getAge());
		bo.setAddress(dto.getAddress());
		bo.setReport(dto.getReport());
		bo.setMobile(dto.getMobile());
		bo.setEmail(dto.getEmail());
		
		count=dao.insert(bo);
		if(count==0)
		
		return "Registration failed try again";
		else
			return "Registration Successfull --Record inserted";
	}

}
