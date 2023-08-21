package com.voyager.enterprise.commercial.entity;

import com.voyager.enterprise.commercial.entity.enums.BuyerEnum;
import com.voyager.enterprise.commercial.entity.enums.SellerEnum;
import com.voyager.enterprise.economy.entity.transaction.Transference;
import com.voyager.enterprise.entity.Person;

import java.util.List;

public class Seller extends Person {
    SellerEnum type;
    List<Sale> sales;

    public SellerEnum getType() {
        return type;
    }

    public void setType(SellerEnum type) {
        this.type = type;
    }

    public List<Sale> getSales() {
        return sales;
    }

    public void setSales(List<Sale> sales) {
        this.sales = sales;
    }
}
