package com.voyager.enterprise.entity;

import com.voyager.enterprise.logistics.entity.distribution.Address;
import com.voyager.enterprise.entity.person.Contact;
import com.voyager.enterprise.plugin.tax.entity.TaxIdentification;
import com.voyager.enterprise.util.Code;

import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Person {

    private UUID id;
    private Code<String> code;
    private Map<String,String> attributes;
    private String desc;
    
    private String name;
    private TaxIdentification identification;
    private List<Address> listAddress;
    private List<Contact> listContact;

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
	public TaxIdentification getIdentification() {
		return identification;
	}
	public void setIdentification(TaxIdentification identification) {
		this.identification = identification;
	}
	public List<Address> getListAddress() {
		return listAddress;
	}
	public void setListAddress(List<Address> listAddress) {
		this.listAddress = listAddress;
	}
	public List<Contact> getListContact() {
		return listContact;
	}
	public void setListContact(List<Contact> listContact) {
		this.listContact = listContact;
	}

}
