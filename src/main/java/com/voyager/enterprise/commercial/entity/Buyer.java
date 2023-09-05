package com.voyager.enterprise.commercial.entity;

import com.voyager.enterprise.commercial.entity.enums.BuyerEnum;
import com.voyager.enterprise.entity.Person;

import java.util.List;

public class Buyer extends Person {
    BuyerEnum type;
    List<Purchase> purchases;

    public BuyerEnum getType() {
        return type;
    }

    public void setType(BuyerEnum type) {
        this.type = type;
    }

    public List<Purchase> getPurchases() {
        return purchases;
    }

    public void setPurchases(List<Purchase> purchases) {
        this.purchases = purchases;
    }
}
