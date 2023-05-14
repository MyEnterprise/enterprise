package com.voyager.enterprise.economy.entity.transaction.transference;

import com.voyager.enterprise.economy.entity.transaction.transference.enums.TransferenceEnum;

import java.time.LocalDate;
import java.util.Properties;

public class StatusTransference {
    public TransferenceEnum status;
    public String desc;
    public LocalDate dt;
    public Properties properties;
}
