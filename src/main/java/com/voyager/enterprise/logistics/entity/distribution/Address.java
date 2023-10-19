package com.voyager.enterprise.logistics.entity.distribution;

import java.util.Map;
import java.util.UUID;

import com.voyager.enterprise.util.Code;

public class Address {

	private UUID id;
    private Code<String> code;
    private Map<String,String> attributes;
    private String desc;

    private boolean main;
    private String country;
    private String stateOrProvince;
    private String city;
    private String districtOrBurgh;
    private String street;
    private String number;

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
	public boolean isMain() {
		return main;
	}
	public void setMain(boolean main) {
		this.main = main;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getStateOrProvince() {
		return stateOrProvince;
	}
	public void setStateOrProvince(String stateOrProvince) {
		this.stateOrProvince = stateOrProvince;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrictOrBurgh() {
		return districtOrBurgh;
	}
	public void setDistrictOrBurgh(String districtOrBurgh) {
		this.districtOrBurgh = districtOrBurgh;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}

}
