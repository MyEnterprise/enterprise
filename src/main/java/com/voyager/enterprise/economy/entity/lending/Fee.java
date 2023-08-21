package com.voyager.enterprise.economy.entity.lending;

import com.voyager.enterprise.economy.entity.merchandise.Coin;

import java.math.BigDecimal;

public class Fee {
    public String desc;
    public Coin coin;
    public BigDecimal amount;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Coin getCoin() {
        return coin;
    }

    public void setCoin(Coin coin) {
        this.coin = coin;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
