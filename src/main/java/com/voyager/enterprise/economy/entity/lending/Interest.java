package com.voyager.enterprise.economy.entity.lending;

import com.voyager.enterprise.economy.entity.enums.InterestEnum;
import com.voyager.enterprise.economy.entity.merchandise.Coin;

import java.math.BigDecimal;

public class Interest {
    public String desc;
    public InterestEnum interestEnum;
    public BigDecimal percentage;
}
