package com.voyager.enterprise.economy.entity.transaction;

import com.voyager.enterprise.economy.entity.transaction.transference.TransferenceStatus;
import com.voyager.enterprise.economy.entity.Merchandise;
import com.voyager.enterprise.economy.entity.transaction.transference.enums.TransferenceStatusEnum;
import com.voyager.enterprise.entity.Person;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

public class Transference {
    public UUID id;
    public String desc;
    public Merchandise merchandise;
    public BigDecimal amount;
    public TransferenceStatusEnum status;
    public List<TransferenceStatus> listStatus;
    public Person sender;
    public Person receiver;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Merchandise getMerchandise() {
        return merchandise;
    }

    public void setMerchandise(Merchandise merchandise) {
        this.merchandise = merchandise;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public TransferenceStatusEnum getStatus() {
        return status;
    }

    public void setStatus(TransferenceStatusEnum status) {
        this.status = status;
    }

    public List<TransferenceStatus> getListStatus() {
        return listStatus;
    }

    public void setListStatus(List<TransferenceStatus> listStatus) {
        this.listStatus = listStatus;
    }

    public Person getSender() {
        return sender;
    }

    public void setSender(Person sender) {
        this.sender = sender;
    }

    public Person getReceiver() {
        return receiver;
    }

    public void setReceiver(Person receiver) {
        this.receiver = receiver;
    }
}