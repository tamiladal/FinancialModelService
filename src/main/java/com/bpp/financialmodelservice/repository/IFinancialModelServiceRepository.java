/**
 * 
 */
package com.bpp.financialmodelservice.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bpp.financialmodelservice.domain.FinancialModel;

/**
 * @author Adalarasu
 *
 */
@Repository
public interface IFinancialModelServiceRepository  extends MongoRepository<FinancialModel,String>{

	List<FinancialModel> findByUserNameAndClientName(String userName, String clientName);
}
