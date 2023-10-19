package com.voyager.enterprise.economy.entity.transaction;

import com.voyager.enterprise.economy.entity.transaction.transference.TransferenceStatus;
import com.voyager.enterprise.economy.entity.Merchandise;
import com.voyager.enterprise.economy.entity.transaction.transference.enums.TransferenceStatusEnum;
import com.voyager.enterprise.entity.Person;
import com.voyager.enterprise.util.Code;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Transference {

	private UUID id;
    private Code<String> code;
    private Map<String,String> attributes;
    private String desc;

    private Merchandise merchandise;
    private BigDecimal amount;
    private TransferenceStatusEnum status;
    private List<TransferenceStatus> listStatus;
    private Person sender;
    private Person receiver;

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
	public Merchandise getMerchandise() {
		return merchandise;
	}
	public void setMerchandise(Merchandise merchandise) {
		this.merchandise = merchandise;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public TransferenceStatusEnum getStatus() {
		return status;
	}
	public void setStatus(TransferenceStatusEnum status) {
		this.status = status;
	}
	public List<TransferenceStatus> getListStatus() {
		return listStatus;
	}
	public void setListStatus(List<TransferenceStatus> listStatus) {
		this.listStatus = listStatus;
	}
	public Person getSender() {
		return sender;
	}
	public void setSender(Person sender) {
		this.sender = sender;
	}
	public Person getReceiver() {
		return receiver;
	}
	public void setReceiver(Person receiver) {
		this.receiver = receiver;
	}

}