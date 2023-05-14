package com.voyager.enterprise.manager.people.entity;

import com.voyager.enterprise.gateway.payment.entity.PaymentIdentificationEntity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Properties;
import java.util.UUID;

public class Payment {

    public UUID id;
    public PaymentIdentificationEntity paymentIdentification;
    public LocalDate dt;
    public String cod;
    public Properties properties;
    public BigDecimal value;
}
