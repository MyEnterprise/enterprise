package com.voyager.enterprise.commercial.entity;

import java.math.BigDecimal;

public class Sale extends Order{
    public BigDecimal minPrice;

    public BigDecimal getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(BigDecimal minPrice) {
        this.minPrice = minPrice;
    }
}
