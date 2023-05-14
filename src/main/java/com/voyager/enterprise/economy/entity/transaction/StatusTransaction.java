package com.voyager.enterprise.economy.entity.transaction;

import com.voyager.enterprise.economy.entity.enums.TransactionEnum;
import com.voyager.enterprise.economy.entity.transaction.transference.enums.TransferenceEnum;

import java.time.LocalDate;
import java.util.Properties;

public class StatusTransaction {
    public TransactionEnum status;
    public String desc;
    public LocalDate dt;
    public Properties properties;
}
