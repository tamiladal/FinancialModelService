package com.bpp.financialmodelservice.dto;

import java.util.List;

public class FinancialModelInputDTO {
	
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
	
	private String userName;
	private String clientName;
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
