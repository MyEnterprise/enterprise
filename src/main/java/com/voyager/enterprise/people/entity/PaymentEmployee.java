package com.voyager.enterprise.people.entity;

import com.voyager.enterprise.economy.entity.Transaction;
import com.voyager.enterprise.economy.entity.transaction.Transference;
import com.voyager.enterprise.plugin.payment.entity.PaymentIdentification;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Properties;
import java.util.UUID;

public class PaymentEmployee extends Transaction {
    public PaymentIdentification paymentIdentification;

}
