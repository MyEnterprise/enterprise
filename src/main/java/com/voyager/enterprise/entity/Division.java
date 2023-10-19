package com.voyager.enterprise.entity;

import java.util.List;
import java.util.Map;
import java.util.UUID;

import com.voyager.enterprise.economy.entity.Transaction;
import com.voyager.enterprise.util.Code;

public class Division {

	private UUID id;
    private Code<String> code;
    private Map<String,String> attributes;
    private String desc;

	private Enterprise originalEnterprise;
	private List<Enterprise> resultingEnterprise;
	private Map<Enterprise, Transaction> transferredAssetsEnterprise;

	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public Code<String> getCode() {
		return code;
	}
	public void setCode(Code<String> code) {
		this.code = code;
	}
	public Map<String, String> getAttributes() {
		return attributes;
	}
	public void setAttributes(Map<String, String> attributes) {
		this.attributes = attributes;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
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
