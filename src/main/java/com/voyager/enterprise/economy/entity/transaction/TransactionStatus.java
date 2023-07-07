package com.voyager.enterprise.economy.entity.transaction;

import com.voyager.enterprise.economy.entity.enums.TransactionStatusEnum;

import java.time.LocalDate;
import java.util.Properties;

public class TransactionStatus {
    public TransactionStatusEnum status;
    public String desc;
    public LocalDate dt;
    public Properties properties;
}
