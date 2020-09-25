package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.nt.bo.EmployeeBO;
import com.nt.dao.EmployeeDAO;
import com.nt.dto.EmployeeDTO;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDAO dao;

	public EmployeeServiceImpl(EmployeeDAO dao) {

		this.dao = dao;
	}

	@Override
	public List<EmployeeDTO> fatchEmpByDesg(String desg1, String desg2, String desg3) throws Exception {
		List<EmployeeDTO> listDTO = null;
		List<EmployeeBO> listBO = null;
		EmployeeDTO dto = null;

		// conert desg into upper case
		desg1 = desg1.toUpperCase();
		desg2 = desg2.toUpperCase();
		desg3 = desg3.toUpperCase();

		// calls DAO class method
		listBO = dao.getEmpByDesg(desg1, desg2, desg3);

		listDTO = new ArrayList();
		for (EmployeeBO bo : listBO) {
			// copie each record
			dto = new EmployeeDTO();
			BeanUtils.copyProperties(bo, dto);//// copies data from one javabean object to anthoer bean obj when they
												//// have matching properties names,types
			dto.setSalary((float) Math.round(bo.getSalary()));
			dto.setSerialNo(listDTO.size() + 1);
			// add ech to DTO
			listDTO.add(dto);

		} // for

		return listDTO;
	}

}
