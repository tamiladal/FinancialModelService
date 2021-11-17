package com.bpp.financialmodelservice.dto;

import java.util.List;
import java.util.Map;

public class FinancialModelOutputDTO {

	private String suggestedIdealPlace;
	private List<String> suggestedCusines;
	private Map<Integer,Integer> suggestedCustomers;
	private Map<String,Integer> suggestedPeakHoursOccupancy;
	private Map<Integer,Integer> suggestedIRR;
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
	
	
}
