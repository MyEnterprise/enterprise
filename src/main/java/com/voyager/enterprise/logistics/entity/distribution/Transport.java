package com.voyager.enterprise.logistics.entity.distribution;

import com.voyager.enterprise.logistics.entity.distribution.transport.enums.TransportEnum;
import com.voyager.enterprise.util.Code;
import com.voyager.enterprise.logistics.entity.distribution.transport.TransportStatus;

import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Transport {

	private UUID id;
    private Code<String> code;
    private Map<String,String> attributes;
    private String desc;

    private String carrier;
    private TransportEnum type;
    private List<TransportStatus> listStatus;
    private Address originAdress;
    private Address destinyAddress;

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
	public String getCarrier() {
		return carrier;
	}
	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}
	public TransportEnum getType() {
		return type;
	}
	public void setType(TransportEnum type) {
		this.type = type;
	}
	public List<TransportStatus> getListStatus() {
		return listStatus;
	}
	public void setListStatus(List<TransportStatus> listStatus) {
		this.listStatus = listStatus;
	}
	public Address getOriginAdress() {
		return originAdress;
	}
	public void setOriginAdress(Address originAdress) {
		this.originAdress = originAdress;
	}
	public Address getDestinyAddress() {
		return destinyAddress;
	}
	public void setDestinyAddress(Address destinyAddress) {
		this.destinyAddress = destinyAddress;
	}

}
