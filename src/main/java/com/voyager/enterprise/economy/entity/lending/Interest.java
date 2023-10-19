package com.voyager.enterprise.economy.entity.lending;

import com.voyager.enterprise.economy.entity.enums.InterestEnum;
import com.voyager.enterprise.util.Code;

import java.math.BigDecimal;
import java.util.Map;
import java.util.UUID;

public class Interest {

	private UUID id;
    private Code<String> code;
    private Map<String,String> attributes;
    private String desc;

    private InterestEnum interestEnum;
    private BigDecimal percentage;

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
	public InterestEnum getInterestEnum() {
		return interestEnum;
	}
	public void setInterestEnum(InterestEnum interestEnum) {
		this.interestEnum = interestEnum;
	}
	public BigDecimal getPercentage() {
		return percentage;
	}
	public void setPercentage(BigDecimal percentage) {
		this.percentage = percentage;
	}

}
