package com.voyager.enterprise.economy.entity.transaction;

import com.voyager.enterprise.economy.entity.Merchandise;
import com.voyager.enterprise.economy.entity.transaction.transference.StatusTransference;
import com.voyager.enterprise.economy.entity.transaction.transference.enums.TransferenceEnum;
import com.voyager.enterprise.entity.Person;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

public class Transference {
    public UUID id;
    public String desc;
    public Merchandise merchandise;
    public BigDecimal amount;
    public TransferenceEnum status;
    public List<StatusTransference> listStatus;
    public Person sender;
    public Person receiver;
}