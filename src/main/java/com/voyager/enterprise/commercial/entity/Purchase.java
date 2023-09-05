package com.voyager.enterprise.commercial.entity;

import java.math.BigDecimal;

public class Purchase extends Order{
    public BigDecimal maxPrice;

    public BigDecimal getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(BigDecimal maxPrice) {
        this.maxPrice = maxPrice;
    }
}
