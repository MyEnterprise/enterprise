package com.voyager.enterprise.economy.entity.lending;

import com.voyager.enterprise.economy.entity.enums.InterestEnum;

import java.math.BigDecimal;

public class Interest {
    public String desc;
    public InterestEnum interestEnum;
    public BigDecimal percentage;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public InterestEnum getInterestEnum() {
        return interestEnum;
    }

    public void setInterestEnum(InterestEnum interestEnum) {
        this.interestEnum = interestEnum;
    }

    public BigDecimal getPercentage() {
        return percentage;
    }

    public void setPercentage(BigDecimal percentage) {
        this.percentage = percentage;
    }
}
