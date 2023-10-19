package com.voyager.enterprise.plugin.tax.entity;

import java.util.Map;
import java.util.UUID;

import com.voyager.enterprise.util.Code;

public class TaxIdentification {

	private UUID id;
    private Code<String> code;
    private Map<String,String> attributes;
    private String desc;
    
    private Tax tax;
    private String identification;

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
	public Tax getTax() {
		return tax;
	}
	public void setTax(Tax tax) {
		this.tax = tax;
	}
	public String getIdentification() {
		return identification;
	}
	public void setIdentification(String identification) {
		this.identification = identification;
	}

}
