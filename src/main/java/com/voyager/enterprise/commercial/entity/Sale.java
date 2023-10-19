package com.voyager.enterprise.commercial.entity;

import java.math.BigDecimal;
import java.util.Map;
import java.util.UUID;

import com.voyager.enterprise.util.Code;

public class Sale extends Order{
	
	private UUID id;
    private Code<String> code;
    private Map<String,String> attributes;
    private String desc;
    
    private BigDecimal minPrice;

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

	public BigDecimal getMinPrice() {
		return minPrice;
	}

	public void setMinPrice(BigDecimal minPrice) {
		this.minPrice = minPrice;
	}

}
