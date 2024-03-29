package com.voyager.enterprise.logistics.entity.storage;

import com.voyager.enterprise.logistics.entity.distribution.Address;
import com.voyager.enterprise.util.Code;

import java.util.List;
import java.util.Map;
import java.util.UUID;

public class WareHouse {

	private UUID id;
    private Code<String> code;
    private Map<String,String> attributes;
    private String desc;

    private String name;
    private Address local;
    private List<Deposit> listDeposit;

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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getLocal() {
		return local;
	}
	public void setLocal(Address local) {
		this.local = local;
	}
	public List<Deposit> getListDeposit() {
		return listDeposit;
	}
	public void setListDeposit(List<Deposit> listDeposit) {
		this.listDeposit = listDeposit;
	}

}
