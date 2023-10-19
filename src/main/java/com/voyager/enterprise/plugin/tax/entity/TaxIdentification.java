package com.voyager.enterprise.plugin.tax.entity;

import java.util.UUID;

public class TaxIdentification {

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
