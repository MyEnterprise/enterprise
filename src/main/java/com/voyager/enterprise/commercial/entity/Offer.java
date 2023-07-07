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
    public Properties properties;

}
