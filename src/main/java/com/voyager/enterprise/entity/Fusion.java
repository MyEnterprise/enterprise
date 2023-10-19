package com.voyager.enterprise.entity;

import java.util.List;
import java.util.Map;
import java.util.UUID;

import com.voyager.enterprise.util.Code;

public class Fusion {

	private UUID id;
    private Code<String> code;
    private Map<String,String> attributes;
    private String desc;

	private List<Enterprise> mergingEnterprise;
	private Enterprise resultingEnterprise;
	private Map<Enterprise, Double> ownershipPercentages;

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
