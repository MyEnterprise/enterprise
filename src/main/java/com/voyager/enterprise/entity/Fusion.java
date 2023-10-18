package com.voyager.enterprise.entity;

import java.util.List;
import java.util.Map;

public class Fusion {

	private List<Enterprise> mergingEnterprise;
	private Enterprise resultingEnterprise;
	private Map<Enterprise, Double> ownershipPercentages;

	public List<Enterprise> getMergingEnterprise() {
		return mergingEnterprise;
	}
	public void setMergingEnterprise(List<Enterprise> mergingEnterprise) {
		this.mergingEnterprise = mergingEnterprise;
	}
	public Enterprise getResultingEnterprise() {
		return resultingEnterprise;
	}
	public void setResultingEnterprise(Enterprise resultingEnterprise) {
		this.resultingEnterprise = resultingEnterprise;
	}
	public Map<Enterprise, Double> getOwnershipPercentages() {
		return ownershipPercentages;
	}
	public void setOwnershipPercentages(Map<Enterprise, Double> ownershipPercentages) {
		this.ownershipPercentages = ownershipPercentages;
	}
	
}
