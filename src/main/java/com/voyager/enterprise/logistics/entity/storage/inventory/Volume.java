package com.voyager.enterprise.logistics.entity.storage.inventory;

import java.math.BigDecimal;
import java.util.Map;
import java.util.UUID;

import com.voyager.enterprise.util.Code;

public class Volume {

	private UUID id;
    private Code<String> code;
    private Map<String,String> attributes;
    private String desc;

    private BigDecimal width;
    private BigDecimal height;
    private BigDecimal depth;
    private String unit;

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
	public BigDecimal getWidth() {
		return width;
	}
	public void setWidth(BigDecimal width) {
		this.width = width;
	}
	public BigDecimal getHeight() {
		return height;
	}
	public void setHeight(BigDecimal height) {
		this.height = height;
	}
	public BigDecimal getDepth() {
		return depth;
	}
	public void setDepth(BigDecimal depth) {
		this.depth = depth;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}

}
