package com.voyager.enterprise.logistics.entity.storage.inventory.bound;


import com.voyager.enterprise.logistics.entity.storage.inventory.bound.enums.BoundStatusEnum;

import java.time.LocalDate;
import java.util.Map;
import java.util.Properties;

public class BoundStatus {
    public BoundStatusEnum status;
    public String desc;
    public LocalDate dt;
    public Map<String,String> attributes;

    public BoundStatusEnum getStatus() {
        return status;
    }

    public void setStatus(BoundStatusEnum status) {
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
}
