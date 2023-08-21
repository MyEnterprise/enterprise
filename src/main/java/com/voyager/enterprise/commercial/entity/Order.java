package com.voyager.enterprise.commercial.entity;

import com.voyager.enterprise.economy.entity.Transaction;
import com.voyager.enterprise.logistics.entity.storage.WareHouse;

import java.math.BigDecimal;
import java.util.List;

public class Order {
    private Offer offer;
    private BigDecimal amount;
    WareHouse deposit;
    private List<Transaction> transaction;

    public Offer getOffer() {
        return offer;
    }

    public void setOffer(Offer offer) {
        this.offer = offer;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public WareHouse getDeposit() {
        return deposit;
    }

    public void setDeposit(WareHouse deposit) {
        this.deposit = deposit;
    }

    public List<Transaction> getTransaction() {
        return transaction;
    }

    public void setTransaction(List<Transaction> transaction) {
        this.transaction = transaction;
    }
}
