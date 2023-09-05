package com.voyager.enterprise.economy.entity.transaction.transference;

import com.voyager.enterprise.economy.entity.transaction.transference.enums.TransferenceStatusEnum;

import java.time.LocalDate;
import java.util.Map;

public class TransferenceStatus {
    public TransferenceStatusEnum status;
    public String desc;
    public LocalDate dt;
    public Map<String,String> attributes;

    public TransferenceStatusEnum getStatus() {
        return status;
    }

    public void setStatus(TransferenceStatusEnum status) {
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
