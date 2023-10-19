package com.voyager.enterprise.financial.entity;

import java.util.Map;
import java.util.UUID;

import com.voyager.enterprise.economy.entity.enums.PriceEnum;
import com.voyager.enterprise.financial.entity.resources.Cost;
import com.voyager.enterprise.util.Code;

public class Resource {

	private UUID id;
    private Code<String> code;
    private Map<String,String> attributes;
    private String desc;

    private Cost cost;
    private PriceEnum priceEnum;
    
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
	public Cost getCost() {
		return cost;
	}
	public void setCost(Cost cost) {
		this.cost = cost;
	}
	public PriceEnum getPriceEnum() {
		return priceEnum;
	}
	public void setPriceEnum(PriceEnum priceEnum) {
		this.priceEnum = priceEnum;
	}

}
