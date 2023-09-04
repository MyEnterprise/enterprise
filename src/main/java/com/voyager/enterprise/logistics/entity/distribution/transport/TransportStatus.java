package com.voyager.enterprise.logistics.entity.distribution.transport;

import com.voyager.enterprise.logistics.entity.distribution.transport.enums.TransportStatusEnum;

import java.time.LocalDate;
import java.util.Map;
import java.util.UUID;

public class TransportStatus {
    public UUID id;
    public TransportStatusEnum status;
    public String desc;
    public LocalDate dt;
    public Map<String,String> attributes;

    public TransportStatusEnum getStatus() {
        return status;
    }

    public void setStatus(TransportStatusEnum status) {
        this.status = status;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public LocalDate getDt() {
        return dt;
    }

    public void setDt(LocalDate dt) {
        this.dt = dt;
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, String> attributes) {
        this.attributes = attributes;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}

