package com.voyager.enterprise.logistics.entity.distribution.transport;

import com.voyager.enterprise.logistics.entity.distribution.transport.enums.TransportStatusEnum;
import com.voyager.enterprise.util.Code;

import java.time.LocalDate;
import java.util.Map;
import java.util.UUID;

public class TransportStatus {

	private UUID id;
    private Code<String> code;
    private Map<String,String> attributes;
    private String desc;

    private TransportStatusEnum status;
    private LocalDate dt;

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
	public TransportStatusEnum getStatus() {
		return status;
	}
	public void setStatus(TransportStatusEnum status) {
		this.status = status;
	}
	public LocalDate getDt() {
		return dt;
	}
	public void setDt(LocalDate dt) {
		this.dt = dt;
	}

}

