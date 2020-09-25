package com.nt.controller;

import com.nt.dto.CoustomerDTO;
import com.nt.service.CoustomerService;
import com.nt.vo.CoustomerVO;

public class MainController {

	private CoustomerService service = null;

	public MainController(CoustomerService service) {
   System.out.println("MainController.MainController()");
		this.service = service;
	}

	public String processCoustomer(CoustomerVO vo) throws Exception {
		CoustomerDTO dto = null;
		String result = null;
		// get DTO cls obj
		dto = new CoustomerDTO();
		// set values to DTO fromVO
		dto.setCname(vo.getCname());
		dto.setCadds(vo.getCadd());
		dto.setPamt(Float.parseFloat(vo.getPamt()));
		dto.setRate(Float.parseFloat(vo.getRate()));
		dto.setTime(Float.parseFloat(vo.getTime()));

		// get call service class
		result = service.CalculateIntrest(dto);

		return result;
	}
}
