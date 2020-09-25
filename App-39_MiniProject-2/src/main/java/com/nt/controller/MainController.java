package com.nt.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.nt.dto.EmployeeDTO;
import com.nt.service.EmployeeService;
import com.nt.vo.EmployeeVO;

public class MainController {

	private EmployeeService service;

	public MainController(EmployeeService service) {

		this.service = service;
	}

	public List<EmployeeVO> getherEmpByDesg(String desg1, String desg2, String desg3) throws Exception {
		List<EmployeeDTO> listDTO = null;
		List<EmployeeVO> listVO = null;
		EmployeeVO vo = null;

		// calls DTO class method

		listDTO = service.fatchEmpByDesg(desg1, desg2, desg3);
           vo=new EmployeeVO();
		listVO = new ArrayList();
		
		
		for (EmployeeDTO dto : listDTO) {
			

			
			BeanUtils.copyProperties(dto, vo);
			vo.setSeriallNo(String.valueOf(dto.getSerialNo()));
			vo.setEno(String.valueOf(dto.getEno()));
			vo.setSalary(String.valueOf(dto.getSalary()));
			vo.setDeptno(String.valueOf(dto.getDeptno()));
			
			// to List Obje
			listVO.add(vo);

		}
		return listVO;
	}

}
