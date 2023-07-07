package com.voyager.enterprise.commercial.entity;

import com.voyager.enterprise.commercial.entity.enums.BuyerEnum;
import com.voyager.enterprise.economy.entity.transaction.Transference;
import com.voyager.enterprise.entity.Person;

import java.util.List;

public class Buyer extends Person {
    BuyerEnum type;
    List<Purchase> purchases;
}
