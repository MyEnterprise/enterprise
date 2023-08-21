package com.voyager.enterprise.economy.entity;

import com.voyager.enterprise.economy.entity.enums.RecurringEnum;

public class Recurring extends Transaction{
    // transações recorrentes que sempre entram no processo
    public RecurringEnum recurringEnum;

    public RecurringEnum getRecurringEnum() {
        return recurringEnum;
    }

    public void setRecurringEnum(RecurringEnum recurringEnum) {
        this.recurringEnum = recurringEnum;
    }
}
