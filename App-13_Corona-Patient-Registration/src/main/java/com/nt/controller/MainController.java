package com.nt.controller;

import com.nt.dto.PatientDTO;
import com.nt.service.PatientService;
import com.nt.vo.PatientVO;

public class MainController {
	private PatientService service;

	public MainController(PatientService service) {

		this.service = service;
	}

	public String porcess(PatientVO vo) throws Exception {
		String result = null;

		PatientDTO dto = null;
		// get DTO class obj
		dto = new PatientDTO();

		// get VO class data and set to DTO class
		dto.setName(vo.getName());
		dto.setAge(Integer.parseInt(vo.getAge()));
		dto.setAddress(vo.getAddress());
		dto.setReport(vo.getReport());
		dto.setMobile(Long.parseLong(vo.getMobile()));
		dto.setEmail(vo.getEmail());
		result = service.processReport(dto);

		return result;
	}

}
