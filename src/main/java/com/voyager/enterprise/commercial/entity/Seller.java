package com.voyager.enterprise.commercial.entity;

import com.voyager.enterprise.commercial.entity.enums.SellerEnum;
import com.voyager.enterprise.entity.Person;
import com.voyager.enterprise.util.Code;

import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Seller extends Person {
	
	private UUID id;
    private Code<String> code;
    private Map<String,String> attributes;
    private String desc;
    
    private SellerEnum type;
    private List<Sale> sales;

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
	public SellerEnum getType() {
		return type;
	}
	public void setType(SellerEnum type) {
		this.type = type;
	}
	public List<Sale> getSales() {
		return sales;
	}
	public void setSales(List<Sale> sales) {
		this.sales = sales;
	}

}
