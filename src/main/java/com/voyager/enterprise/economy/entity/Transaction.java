package com.voyager.enterprise.economy.entity;

import com.voyager.enterprise.economy.entity.enums.TransactionEnum;
import com.voyager.enterprise.economy.entity.transaction.StatusTransaction;
import com.voyager.enterprise.economy.entity.transaction.Transference;

import java.time.LocalDate;
import java.util.List;
import java.util.Properties;
import java.util.UUID;

public class Transaction {
    public UUID id;
    public List<Transference> listTransference;

    public TransactionEnum status;
    public List<StatusTransaction> listStatus;
    public String desc;
    public Properties properties;
    public LocalDate dt;
}
