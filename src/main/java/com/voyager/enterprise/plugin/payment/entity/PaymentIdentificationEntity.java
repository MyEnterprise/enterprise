package com.voyager.enterprise.plugin.payment.entity;

import java.util.UUID;

public class PaymentIdentificationEntity {

    public UUID id;
    private String identification;
    public Payment payment;
    public String getIdentification() {
        return identification;
    }
    public void setIdentification(String identification) {
        this.identification = identification;
    }

}
