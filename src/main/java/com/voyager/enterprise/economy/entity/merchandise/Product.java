package com.voyager.enterprise.economy.entity.merchandise;

import com.voyager.enterprise.economy.entity.Merchandise;
import com.voyager.enterprise.logistics.entity.storage.inventory.Volume;
import com.voyager.enterprise.util.Code;

import java.math.BigDecimal;
import java.util.Map;
import java.util.UUID;

public class Product extends Merchandise {

	private UUID id;
    private Code<String> code;
    private Map<String,String> attributes;
    private String desc;

    private Volume volume;
    private BigDecimal weight;

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
	public Volume getVolume() {
		return volume;
	}
	public void setVolume(Volume volume) {
		this.volume = volume;
	}
	public BigDecimal getWeight() {
		return weight;
	}
	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}

}
