package com.voyager.enterprise.economy.entity.merchandise;

import com.voyager.enterprise.economy.entity.Merchandise;
import com.voyager.enterprise.logistics.entity.storage.inventory.Volume;

import java.math.BigDecimal;

public class Product extends Merchandise {
    public Volume volume;
    public BigDecimal weight;
}
