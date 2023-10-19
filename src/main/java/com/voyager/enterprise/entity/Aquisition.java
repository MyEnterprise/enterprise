package com.voyager.enterprise.entity;

import java.util.Map;
import java.util.UUID;

import com.voyager.enterprise.economy.entity.Transaction;
import com.voyager.enterprise.util.Code;

public class Aquisition {

	private UUID id;
    private Code<String> code;
    private Map<String,String> attributes;
    private String desc;

	private Enterprise acquiring;
	private Enterprise acquired;
	private Transaction cost;

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
	public Enterprise getAcquiring() {
		return acquiring;
	}
	public void setAcquiring(Enterprise acquiring) {
		this.acquiring = acquiring;
	}
	public Enterprise getAcquired() {
		return acquired;
	}
	public void setAcquired(Enterprise acquired) {
		this.acquired = acquired;
	}
	public Transaction getCost() {
		return cost;
	}
	public void setCost(Transaction cost) {
		this.cost = cost;
	}

}
