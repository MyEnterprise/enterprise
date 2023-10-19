package com.voyager.enterprise.logistics.entity.storage;

import com.voyager.enterprise.logistics.entity.storage.inventory.InBound;
import com.voyager.enterprise.logistics.entity.storage.inventory.OutBound;
import com.voyager.enterprise.util.Code;

import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Inventory {
    
	private UUID id;
    private Code<String> code;
    private Map<String,String> attributes;
    private String desc;

    // formato de organização
    // Aberto
    // Prateleiras
    // Pilhas

    private List<InBound> listInBound;
    private List<OutBound> listOutBound;

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
	public List<InBound> getListInBound() {
		return listInBound;
	}
	public void setListInBound(List<InBound> listInBound) {
		this.listInBound = listInBound;
	}
	public List<OutBound> getListOutBound() {
		return listOutBound;
	}
	public void setListOutBound(List<OutBound> listOutBound) {
		this.listOutBound = listOutBound;
	}

}
