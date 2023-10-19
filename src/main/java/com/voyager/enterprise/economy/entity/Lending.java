package com.voyager.enterprise.economy.entity;

import com.voyager.enterprise.economy.entity.lending.Fee;
import com.voyager.enterprise.economy.entity.lending.Interest;
import com.voyager.enterprise.util.Code;

import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Lending extends Transaction{

	private UUID id;
    private Code<String> code;
    private Map<String,String> attributes;
    private String desc;
    
    /*

        juros inicial, tipo de juros calculo de juros, renegociação de dividas etc etc

    */
    // taxas de processamento, taxas de manutenção de conta e outros encargos
    private List<Fee> listFee;
    private List<Interest> listInterest;

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
	public List<Fee> getListFee() {
		return listFee;
	}
	public void setListFee(List<Fee> listFee) {
		this.listFee = listFee;
	}
	public List<Interest> getListInterest() {
		return listInterest;
	}
	public void setListInterest(List<Interest> listInterest) {
		this.listInterest = listInterest;
	}

}
