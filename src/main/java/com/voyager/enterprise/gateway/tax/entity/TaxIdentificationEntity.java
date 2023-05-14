package com.voyager.enterprise.gateway.tax.entity;

import java.util.UUID;

public class TaxIdentificationEntity {

    public UUID id;
    public Tax tax;
    private String identification;
    public String getIdentification() {
        return identification;
    }
    public void setIdentification(String identification) {
        this.identification = identification;
    }
}
