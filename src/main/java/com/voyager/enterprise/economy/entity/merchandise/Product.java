package com.voyager.enterprise.economy.entity.merchandise;

import com.voyager.enterprise.economy.entity.Merchandise;
import com.voyager.enterprise.logistics.entity.storage.inventory.Volume;

import java.math.BigDecimal;

public class Product extends Merchandise {
    public Volume volume;
    public BigDecimal weight;

    public Volume getVolume() {
        return volume;
    }

    public void setVolume(Volume volume) {
        this.volume = volume;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }
}
