package com.voyager.enterprise.entity;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.UUID;

import com.voyager.enterprise.util.Code;

public class Enterprise extends Person{

	private UUID id;
    private Code<String> code;
    private Map<String,String> attributes;
    private String desc;

    private String name;
    private List<String> listSegment;

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
	public List<String> getListSegment() {
		return listSegment;
	}
	public void setListSegment(List<String> listSegment) {
		this.listSegment = listSegment;
	}

}