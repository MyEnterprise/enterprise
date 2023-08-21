package com.voyager.enterprise.economy.entity;

import com.voyager.enterprise.economy.entity.lending.Fee;
import com.voyager.enterprise.economy.entity.lending.Interest;

import java.util.List;

public class Lending extends Transaction{
    /*

        juros inicial, tipo de juros calculo de juros, renegociação de dividas etc etc

    */
    // taxas de processamento, taxas de manutenção de conta e outros encargos
    public List<Fee> listFee;
    public List<Interest> listInterest;

    public List<Fee> getListFee() {
        return listFee;
    }

    public void setListFee(List<Fee> listFee) {
        this.listFee = listFee;
    }

    public List<Interest> getListInterest() {
        return listInterest;
    }

    public void setListInterest(List<Interest> listInterest) {
        this.listInterest = listInterest;
    }
}
