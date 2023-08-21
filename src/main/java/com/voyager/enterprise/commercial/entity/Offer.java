package com.voyager.enterprise.commercial.entity;

import com.voyager.enterprise.economy.entity.Merchandise;
import com.voyager.enterprise.economy.entity.merchandise.Coin;
import com.voyager.enterprise.economy.entity.merchandise.Product;

import java.util.Map;
import java.util.Properties;

public class Offer {

    public Merchandise merchandise;
    public String name;
    public String descr;
    public Map<String,String> attributes;

    public Merchandise getMerchandise() {
        return merchandise;
    }

    public void setMerchandise(Merchandise merchandise) {
        this.merchandise = merchandise;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, String> attributes) {
        this.attributes = attributes;
    }
}
