package com.voyager.enterprise.commercial.entity;

import com.voyager.enterprise.economy.entity.Transaction;
import com.voyager.enterprise.logistics.entity.storage.WareHouse;
import com.voyager.enterprise.util.Code;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Order {

	private UUID id;
    private Code<String> code;
    private Map<String,String> attributes;
    private String desc;

    private Offer offer;
    private BigDecimal amount;
    private WareHouse deposit;
    private List<Transaction> transaction;

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
	public Offer getOffer() {
		return offer;
	}
	public void setOffer(Offer offer) {
		this.offer = offer;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public WareHouse getDeposit() {
		return deposit;
	}
	public void setDeposit(WareHouse deposit) {
		this.deposit = deposit;
	}
	public List<Transaction> getTransaction() {
		return transaction;
	}
	public void setTransaction(List<Transaction> transaction) {
		this.transaction = transaction;
	}

}
