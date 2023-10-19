package com.voyager.enterprise.logistics.entity.storage;

import com.voyager.enterprise.logistics.entity.storage.enums.DepositEnum;
import com.voyager.enterprise.util.Code;

import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Deposit {

	private UUID id;
    private Code<String> code;
    private Map<String,String> attributes;
    private String desc;

    private Inventory inventory;
    private List<DepositEnum> type;

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
	public Inventory getInventory() {
		return inventory;
	}
	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}
	public List<DepositEnum> getType() {
		return type;
	}
	public void setType(List<DepositEnum> type) {
		this.type = type;
	}

}
