package com.voyager.enterprise.logistics.entity.storage.inventory;

import com.voyager.enterprise.economy.entity.merchandise.Product;
import com.voyager.enterprise.util.Code;

import java.math.BigDecimal;

public class Shipments {
    public Code<String> code;
    public Product merchandise;
    public BigDecimal ammount;

}
