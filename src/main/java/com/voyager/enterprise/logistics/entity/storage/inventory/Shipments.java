package com.voyager.enterprise.logistics.entity.storage.inventory;

import com.voyager.enterprise.economy.entity.merchandise.Product;
import com.voyager.enterprise.util.Code;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Shipments {
    public Code<String> code;
    public Product merchandise;
    public LocalDate dtValid;
    public BigDecimal ammount;

    public Code<String> getCode() {
        return code;
    }

    public void setCode(Code<String> code) {
        this.code = code;
    }

    public Product getMerchandise() {
        return merchandise;
    }

    public void setMerchandise(Product merchandise) {
        this.merchandise = merchandise;
    }

    public LocalDate getDtValid() {
        return dtValid;
    }

    public void setDtValid(LocalDate dtValid) {
        this.dtValid = dtValid;
    }

    public BigDecimal getAmmount() {
        return ammount;
    }

    public void setAmmount(BigDecimal ammount) {
        this.ammount = ammount;
    }
}
