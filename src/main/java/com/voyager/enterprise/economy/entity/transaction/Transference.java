package com.voyager.enterprise.economy.entity.transaction;

import com.voyager.enterprise.economy.entity.Merchandise;
import com.voyager.enterprise.economy.entity.transaction.transference.TransferenceStatus;
import com.voyager.enterprise.economy.entity.transaction.transference.enums.TransferenceStatusEnum;
import com.voyager.enterprise.entity.Person;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

public class Transference {
    public UUID id;
    public String desc;
    public Merchandise merchandise;
    public BigDecimal amount;
    public TransferenceStatusEnum status;
    public List<TransferenceStatus> listStatus;
    public Person sender;
    public Person receiver;
}