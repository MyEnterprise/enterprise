package com.voyager.enterprise.economy.entity.transaction.transference;

import com.voyager.enterprise.economy.entity.transaction.transference.enums.TransferenceStatusEnum;

import java.time.LocalDate;
import java.util.Properties;

public class TransferenceStatus {
    public TransferenceStatusEnum status;
    public String desc;
    public LocalDate dt;
    public Properties properties;
}
