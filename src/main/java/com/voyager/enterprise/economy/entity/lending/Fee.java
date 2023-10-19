package com.voyager.enterprise.economy.entity.lending;

import com.voyager.enterprise.economy.entity.merchandise.Coin;
import com.voyager.enterprise.util.Code;

import java.math.BigDecimal;
import java.util.Map;
import java.util.UUID;

public class Fee {

	private UUID id;
    private Code<String> code;
    private Map<String,String> attributes;
    private String desc;

    private Coin coin;
    private BigDecimal amount;

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
	public Coin getCoin() {
		return coin;
	}
	public void setCoin(Coin coin) {
		this.coin = coin;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

}
