package com.voyager.enterprise.people.entity;

import com.voyager.enterprise.entity.Person;
import com.voyager.enterprise.util.Code;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Employee extends Person {

	private UUID id;
    private Code<String> code;
    private Map<String,String> attributes;
    private String desc;

    private List<Office> office;
    private String race;
    private String sex;
    private LocalDate dtBirth;

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
	public List<Office> getOffice() {
		return office;
	}
	public void setOffice(List<Office> office) {
		this.office = office;
	}
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public LocalDate getDtBirth() {
		return dtBirth;
	}
	public void setDtBirth(LocalDate dtBirth) {
		this.dtBirth = dtBirth;
	}

}