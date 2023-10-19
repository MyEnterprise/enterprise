package com.voyager.enterprise.logistics.entity.storage.inventory;

import com.voyager.enterprise.logistics.entity.distribution.Expedition;
import com.voyager.enterprise.logistics.entity.storage.inventory.bound.BoundStatus;
import com.voyager.enterprise.logistics.entity.storage.inventory.bound.enums.BoundStatusEnum;
import com.voyager.enterprise.util.Code;

import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Bound {

	private UUID id;
    private Code<String> code;
    private Map<String,String> attributes;
    private String desc;
    
    private Expedition expedition;
    private BoundStatusEnum status;
    private List<BoundStatus> listStatus;
    // Obejto com os dados do trasnporte de transporte
    private Code<String> locationInvetory;

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
	public Expedition getExpedition() {
		return expedition;
	}
	public void setExpedition(Expedition expedition) {
		this.expedition = expedition;
	}
	public BoundStatusEnum getStatus() {
		return status;
	}
	public void setStatus(BoundStatusEnum status) {
		this.status = status;
	}
	public List<BoundStatus> getListStatus() {
		return listStatus;
	}
	public void setListStatus(List<BoundStatus> listStatus) {
		this.listStatus = listStatus;
	}
	public Code<String> getLocationInvetory() {
		return locationInvetory;
	}
	public void setLocationInvetory(Code<String> locationInvetory) {
		this.locationInvetory = locationInvetory;
	}

}
