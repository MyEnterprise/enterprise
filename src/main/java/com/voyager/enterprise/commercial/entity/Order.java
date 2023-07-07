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

}
