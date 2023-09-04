package com.voyager.enterprise.logistics.entity.distribution.expedition;

import com.voyager.enterprise.logistics.entity.distribution.expedition.enums.ExpeditionStatusEnum;

import java.time.LocalDate;
import java.util.Map;
import java.util.UUID;

public class ExpeditionStatus {
    public UUID id;
    public ExpeditionStatusEnum status;
    public String desc;
    public LocalDate dt;
    public Map<String,String> attributes;

    public ExpeditionStatusEnum getStatus() {
        return status;
    }

    public void setStatus(ExpeditionStatusEnum status) {
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
