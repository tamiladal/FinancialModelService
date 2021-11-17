/**
 * 
 */
package com.bpp.financialmodelservice.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bpp.financialmodelservice.domain.FinancialModel;
import com.bpp.financialmodelservice.dto.FinancialModelInputDTO;
import com.bpp.financialmodelservice.dto.FinancialModelOutputDTO;
import com.bpp.financialmodelservice.repository.IFinancialModelServiceRepository;

/**
 * @author Adalarasu
 *
 */
@Service
public class FinancialModelServiceImpl {
	
	@Autowired
	ModelMapper modelMapper;
	
	@Autowired
	IFinancialModelServiceRepository financialModelServiceRepository;
	
	List<FinancialModelOutputDTO> fetchFinancialModeledHisto(String userName, String clientName){
		return financialModelServiceRepository.findByUserNameAndClientName(userName, clientName).stream().map(finModel -> modelMapper.map(finModel, FinancialModelOutputDTO.class)).collect(Collectors.toList());
	}
	
	public FinancialModelOutputDTO runFinancialModel(FinancialModelInputDTO financialModelInputDTO) {
		FinancialModel financialModel = modelMapper.map(financialModelInputDTO, FinancialModel.class);
		FinancialModelOutputDTO financialModelOutputDTO = execute(financialModelInputDTO);
		modelMapper.map(financialModelOutputDTO,financialModel);
		financialModelServiceRepository.save(financialModel);
		return financialModelOutputDTO;
	}
	
	private FinancialModelOutputDTO execute(FinancialModelInputDTO financialModelInputDTO) {
		FinancialModelOutputDTO financialModelOutputDTO = new FinancialModelOutputDTO();
		financialModelOutputDTO.setSuggestedIdealPlace("YET TO BE IDENTIFIED");
		return financialModelOutputDTO;
	}
	
}
