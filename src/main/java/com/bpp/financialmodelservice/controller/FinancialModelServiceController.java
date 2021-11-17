package com.bpp.financialmodelservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bpp.financialmodelservice.dto.FinancialModelInputDTO;
import com.bpp.financialmodelservice.dto.FinancialModelOutputDTO;
import com.bpp.financialmodelservice.service.IFinancialModelService;

@RestController
@CrossOrigin
@RequestMapping(path = "/model", produces = MediaType.APPLICATION_JSON_VALUE)
public class FinancialModelServiceController {
	
	@Autowired
	IFinancialModelService financialModelService;
	
	@GetMapping("/check/status")
	public String checkStatus() {
		return "Successfully Checked";
	}
	
	@PostMapping("/fetch/histo")
	public List<FinancialModelOutputDTO> fetchHisto(@RequestBody final FinancialModelInputDTO financialModelInputDTO) {
		return financialModelService.fetchFinancialModeledHisto(financialModelInputDTO.getUserName(),financialModelInputDTO.getClientName());
	}
	
	@PostMapping("/runModel")
	public FinancialModelOutputDTO runFinancialModel(@RequestBody final FinancialModelInputDTO financialModelInputDTO) {
		return financialModelService.runFinancialModel(financialModelInputDTO);
	}
	

}
