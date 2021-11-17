/**
 * 
 */
package com.bpp.financialmodelservice.domain;

import java.util.List;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Adalarasu
 *
 */
@Document("FinancialModel")
public class FinancialModel {

	@Id
	private String id;
	private String countryName;
	private String stateName;
	private String area;
	private String pinCode;
	private List<String> agriculturalProducts;
	private List<String> climaticConditions;
	private List<String> popularCuisines;
	private double landCost;
	private long totalPopulation;
	private float genderRatioOfWorkProf;
	private float kidsRatio;
	
	private String suggestedIdealPlace;
	private List<String> suggestedCusines;
	private Map<Integer,Integer> suggestedCustomers;
	private Map<String,Integer> suggestedPeakHoursOccupancy;
	private Map<Integer,Integer> suggestedIRR;
	
	private String userName;
	private String clientName;
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the countryName
	 */
	public String getCountryName() {
		return countryName;
	}
	/**
	 * @param countryName the countryName to set
	 */
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	/**
	 * @return the stateName
	 */
	public String getStateName() {
		return stateName;
	}
	/**
	 * @param stateName the stateName to set
	 */
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	/**
	 * @return the area
	 */
	public String getArea() {
		return area;
	}
	/**
	 * @param area the area to set
	 */
	public void setArea(String area) {
		this.area = area;
	}
	/**
	 * @return the pinCode
	 */
	public String getPinCode() {
		return pinCode;
	}
	/**
	 * @param pinCode the pinCode to set
	 */
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	/**
	 * @return the agriculturalProducts
	 */
	public List<String> getAgriculturalProducts() {
		return agriculturalProducts;
	}
	/**
	 * @param agriculturalProducts the agriculturalProducts to set
	 */
	public void setAgriculturalProducts(List<String> agriculturalProducts) {
		this.agriculturalProducts = agriculturalProducts;
	}
	/**
	 * @return the climaticConditions
	 */
	public List<String> getClimaticConditions() {
		return climaticConditions;
	}
	/**
	 * @param climaticConditions the climaticConditions to set
	 */
	public void setClimaticConditions(List<String> climaticConditions) {
		this.climaticConditions = climaticConditions;
	}
	/**
	 * @return the popularCuisines
	 */
	public List<String> getPopularCuisines() {
		return popularCuisines;
	}
	/**
	 * @param popularCuisines the popularCuisines to set
	 */
	public void setPopularCuisines(List<String> popularCuisines) {
		this.popularCuisines = popularCuisines;
	}
	/**
	 * @return the landCost
	 */
	public double getLandCost() {
		return landCost;
	}
	/**
	 * @param landCost the landCost to set
	 */
	public void setLandCost(double landCost) {
		this.landCost = landCost;
	}
	/**
	 * @return the totalPopulation
	 */
	public long getTotalPopulation() {
		return totalPopulation;
	}
	/**
	 * @param totalPopulation the totalPopulation to set
	 */
	public void setTotalPopulation(long totalPopulation) {
		this.totalPopulation = totalPopulation;
	}
	/**
	 * @return the genderRatioOfWorkProf
	 */
	public float getGenderRatioOfWorkProf() {
		return genderRatioOfWorkProf;
	}
	/**
	 * @param genderRatioOfWorkProf the genderRatioOfWorkProf to set
	 */
	public void setGenderRatioOfWorkProf(float genderRatioOfWorkProf) {
		this.genderRatioOfWorkProf = genderRatioOfWorkProf;
	}
	/**
	 * @return the kidsRatio
	 */
	public float getKidsRatio() {
		return kidsRatio;
	}
	/**
	 * @param kidsRatio the kidsRatio to set
	 */
	public void setKidsRatio(float kidsRatio) {
		this.kidsRatio = kidsRatio;
	}
	/**
	 * @return the suggestedIdealPlace
	 */
	public String getSuggestedIdealPlace() {
		return suggestedIdealPlace;
	}
	/**
	 * @param suggestedIdealPlace the suggestedIdealPlace to set
	 */
	public void setSuggestedIdealPlace(String suggestedIdealPlace) {
		this.suggestedIdealPlace = suggestedIdealPlace;
	}
	/**
	 * @return the suggestedCusines
	 */
	public List<String> getSuggestedCusines() {
		return suggestedCusines;
	}
	/**
	 * @param suggestedCusines the suggestedCusines to set
	 */
	public void setSuggestedCusines(List<String> suggestedCusines) {
		this.suggestedCusines = suggestedCusines;
	}
	/**
	 * @return the suggestedCustomers
	 */
	public Map<Integer, Integer> getSuggestedCustomers() {
		return suggestedCustomers;
	}
	/**
	 * @param suggestedCustomers the suggestedCustomers to set
	 */
	public void setSuggestedCustomers(Map<Integer, Integer> suggestedCustomers) {
		this.suggestedCustomers = suggestedCustomers;
	}
	/**
	 * @return the suggestedPeakHoursOccupancy
	 */
	public Map<String, Integer> getSuggestedPeakHoursOccupancy() {
		return suggestedPeakHoursOccupancy;
	}
	/**
	 * @param suggestedPeakHoursOccupancy the suggestedPeakHoursOccupancy to set
	 */
	public void setSuggestedPeakHoursOccupancy(Map<String, Integer> suggestedPeakHoursOccupancy) {
		this.suggestedPeakHoursOccupancy = suggestedPeakHoursOccupancy;
	}
	/**
	 * @return the suggestedIRR
	 */
	public Map<Integer, Integer> getSuggestedIRR() {
		return suggestedIRR;
	}
	/**
	 * @param suggestedIRR the suggestedIRR to set
	 */
	public void setSuggestedIRR(Map<Integer, Integer> suggestedIRR) {
		this.suggestedIRR = suggestedIRR;
	}
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the clientName
	 */
	public String getClientName() {
		return clientName;
	}
	/**
	 * @param clientName the clientName to set
	 */
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	
	
}
