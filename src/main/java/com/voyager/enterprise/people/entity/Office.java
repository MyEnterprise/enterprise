package com.voyager.enterprise.people.entity;

import com.voyager.enterprise.financial.entity.Resource;
import com.voyager.enterprise.util.Code;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.UUID;

public class Office{
	private UUID id;
    private Code<String> code;
    private Map<String,String> attributes;
    private String desc;
    
    private Resource resource;
    private String role;
    private BigDecimal salary;
    private Department department;
    private Properties properties;
    private String dtStart;
    private String dtEnd;
    private List<PaymentEmployee> listPayment;

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
	public Resource getResource() {
		return resource;
	}
	public void setResource(Resource resource) {
		this.resource = resource;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Properties getProperties() {
		return properties;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	public String getDtStart() {
		return dtStart;
	}
	public void setDtStart(String dtStart) {
		this.dtStart = dtStart;
	}
	public String getDtEnd() {
		return dtEnd;
	}
	public void setDtEnd(String dtEnd) {
		this.dtEnd = dtEnd;
	}
	public List<PaymentEmployee> getListPayment() {
		return listPayment;
	}
	public void setListPayment(List<PaymentEmployee> listPayment) {
		this.listPayment = listPayment;
	}

}