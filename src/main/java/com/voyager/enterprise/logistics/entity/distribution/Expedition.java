package com.voyager.enterprise.logistics.entity.distribution;

import com.voyager.enterprise.logistics.entity.distribution.expedition.ExpeditionStatus;
import com.voyager.enterprise.logistics.entity.distribution.expedition.enums.ExpeditionEnum;
import com.voyager.enterprise.logistics.entity.storage.inventory.Shipment;
import com.voyager.enterprise.util.Code;

import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Expedition {

	private UUID id;
    private Code<String> code;
    private Map<String,String> attributes;
    private String desc;

    private String locationInvetory;
    private Shipment shipment;
    private List<Transport> transport;
    private ExpeditionEnum type;
    private List<ExpeditionStatus> listStatus;

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
	public String getLocationInvetory() {
		return locationInvetory;
	}
	public void setLocationInvetory(String locationInvetory) {
		this.locationInvetory = locationInvetory;
	}
	public Shipment getShipment() {
		return shipment;
	}
	public void setShipment(Shipment shipment) {
		this.shipment = shipment;
	}
	public List<Transport> getTransport() {
		return transport;
	}
	public void setTransport(List<Transport> transport) {
		this.transport = transport;
	}
	public ExpeditionEnum getType() {
		return type;
	}
	public void setType(ExpeditionEnum type) {
		this.type = type;
	}
	public List<ExpeditionStatus> getListStatus() {
		return listStatus;
	}
	public void setListStatus(List<ExpeditionStatus> listStatus) {
		this.listStatus = listStatus;
	}

}
