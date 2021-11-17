package com.bpp.financialmodelservice.service;

import java.util.List;

import com.bpp.financialmodelservice.dto.FinancialModelInputDTO;
import com.bpp.financialmodelservice.dto.FinancialModelOutputDTO;

public interface IFinancialModelService {
	
	List<FinancialModelOutputDTO> fetchFinancialModeledHisto(String userName, String clientName);
	
	FinancialModelOutputDTO runFinancialModel(FinancialModelInputDTO financialModelInputDTO);
	
	

}
