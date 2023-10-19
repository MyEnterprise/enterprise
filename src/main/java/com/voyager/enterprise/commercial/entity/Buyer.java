package com.voyager.enterprise.commercial.entity;

import com.voyager.enterprise.commercial.entity.enums.BuyerEnum;
import com.voyager.enterprise.entity.Person;
import com.voyager.enterprise.util.Code;

import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Buyer extends Person {

	private UUID id;
    private Code<String> code;
    private Map<String,String> attributes;
    private String desc;

    private BuyerEnum type;
    private List<Purchase> purchases;

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
	public BuyerEnum getType() {
		return type;
	}
	public void setType(BuyerEnum type) {
		this.type = type;
	}
	public List<Purchase> getPurchases() {
		return purchases;
	}
	public void setPurchases(List<Purchase> purchases) {
		this.purchases = purchases;
	}

}
