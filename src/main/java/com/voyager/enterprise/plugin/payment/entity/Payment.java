package com.voyager.enterprise.plugin.payment.entity;

import java.util.Map;
import java.util.UUID;

import com.voyager.enterprise.economy.entity.transaction.Transference;
import com.voyager.enterprise.util.Code;

public class Payment extends Transference{

	private UUID id;
    private Code<String> code;
    private Map<String,String> attributes;
    private String desc;

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

}
