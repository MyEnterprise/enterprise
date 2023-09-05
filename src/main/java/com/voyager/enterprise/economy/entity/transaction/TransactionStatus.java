package com.voyager.enterprise.economy.entity.transaction;

import com.voyager.enterprise.economy.entity.enums.TransactionStatusEnum;

import java.time.LocalDate;
import java.util.Map;

public class TransactionStatus {
    public TransactionStatusEnum status;
    public String desc;
    public LocalDate dt;
    public Map<String,String> attributes;

    public TransactionStatusEnum getStatus() {
        return status;
    }

    public void setStatus(TransactionStatusEnum status) {
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
