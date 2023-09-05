package com.voyager.enterprise.economy.entity;

import com.voyager.enterprise.economy.entity.enums.TransactionStatusEnum;
import com.voyager.enterprise.economy.entity.transaction.TransactionStatus;
import com.voyager.enterprise.economy.entity.transaction.Transference;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Transaction {

    public UUID id;
    public List<Transference> listTransference;
    public TransactionStatusEnum status;
    public List<TransactionStatus> listStatus;
    public String desc;
    public Map<String,String> attributes;
    public LocalDate dt;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public List<Transference> getListTransference() {
        return listTransference;
    }

    public void setListTransference(List<Transference> listTransference) {
        this.listTransference = listTransference;
    }

    public TransactionStatusEnum getStatus() {
        return status;
    }

    public void setStatus(TransactionStatusEnum status) {
        this.status = status;
    }

    public List<TransactionStatus> getListStatus() {
        return listStatus;
    }

    public void setListStatus(List<TransactionStatus> listStatus) {
        this.listStatus = listStatus;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, String> attributes) {
        this.attributes = attributes;
    }

    public LocalDate getDt() {
        return dt;
    }

    public void setDt(LocalDate dt) {
        this.dt = dt;
    }
}
