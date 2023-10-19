package com.voyager.enterprise.people.entity;

import com.voyager.enterprise.economy.entity.Transaction;
import com.voyager.enterprise.economy.entity.transaction.Transference;
import com.voyager.enterprise.plugin.payment.entity.PaymentIdentification;
import com.voyager.enterprise.util.Code;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Map;
import java.util.Properties;
import java.util.UUID;

public class PaymentEmployee extends Transaction {

	private UUID id;
    private Code<String> code;
    private Map<String,String> attributes;
    private String desc;

    private PaymentIdentification paymentIdentification;

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

	public PaymentIdentification getPaymentIdentification() {
		return paymentIdentification;
	}

	public void setPaymentIdentification(PaymentIdentification paymentIdentification) {
		this.paymentIdentification = paymentIdentification;
	}

}
