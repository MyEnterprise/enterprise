package com.voyager.enterprise.entity;

import java.util.List;
import java.util.Map;

import com.voyager.enterprise.economy.entity.Transaction;

public class Division {
	private Enterprise originalEnterprise;
	private List<Enterprise> resultingEnterprise;
	private Map<Enterprise, Transaction> transferredAssetsEnterprise;
	
	public Enterprise getOriginalEnterprise() {
		return originalEnterprise;
	}
	public void setOriginalEnterprise(Enterprise originalEnterprise) {
		this.originalEnterprise = originalEnterprise;
	}
	public List<Enterprise> getResultingEnterprise() {
		return resultingEnterprise;
	}
	public void setResultingEnterprise(List<Enterprise> resultingEnterprise) {
		this.resultingEnterprise = resultingEnterprise;
	}
	public Map<Enterprise, Transaction> getTransferredAssetsEnterprise() {
		return transferredAssetsEnterprise;
	}
	public void setTransferredAssetsEnterprise(Map<Enterprise, Transaction> transferredAssetsEnterprise) {
		this.transferredAssetsEnterprise = transferredAssetsEnterprise;
	}
	
}
