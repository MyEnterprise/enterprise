package com.voyager.enterprise.economy.entity;

import com.voyager.enterprise.economy.entity.enums.TransactionStatusEnum;
import com.voyager.enterprise.economy.entity.transaction.TransactionStatus;
import com.voyager.enterprise.economy.entity.transaction.Transference;

import java.time.LocalDate;
import java.util.List;
import java.util.Properties;
import java.util.UUID;

public class Transaction {

    public UUID id;
    public List<Transference> listTransference;
    public TransactionStatusEnum status;
    public List<TransactionStatus> listStatus;
    public String desc;
    public Properties properties;
    public LocalDate dt;
}
