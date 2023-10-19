package com.voyager.enterprise.logistics.entity.storage.inventory;

import com.voyager.enterprise.economy.entity.merchandise.Product;
import com.voyager.enterprise.util.Code;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Map;
import java.util.UUID;

public class Shipment {
	private UUID id;
    private Code<String> code;
    private Map<String,String> attributes;
    private String desc;

    private Product merchandise;
    private LocalDate dtValid;
    private BigDecimal ammount;

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
	public Product getMerchandise() {
		return merchandise;
	}
	public void setMerchandise(Product merchandise) {
		this.merchandise = merchandise;
	}
	public LocalDate getDtValid() {
		return dtValid;
	}
	public void setDtValid(LocalDate dtValid) {
		this.dtValid = dtValid;
	}
	public BigDecimal getAmmount() {
		return ammount;
	}
	public void setAmmount(BigDecimal ammount) {
		this.ammount = ammount;
	}

}
