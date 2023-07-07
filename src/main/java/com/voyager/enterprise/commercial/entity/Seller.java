package com.voyager.enterprise.commercial.entity;

import com.voyager.enterprise.commercial.entity.enums.BuyerEnum;
import com.voyager.enterprise.commercial.entity.enums.SellerEnum;
import com.voyager.enterprise.economy.entity.transaction.Transference;
import com.voyager.enterprise.entity.Person;

import java.util.List;

public class Seller extends Person {
    SellerEnum type;
    List<Sale> sales;
}
