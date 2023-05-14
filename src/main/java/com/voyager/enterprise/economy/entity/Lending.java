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
}
