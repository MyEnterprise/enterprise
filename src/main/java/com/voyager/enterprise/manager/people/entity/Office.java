package com.voyager.enterprise.manager.people.entity;

import com.voyager.enterprise.manager.entity.Resource;

import java.math.BigDecimal;
import java.util.List;
import java.util.Properties;
import java.util.UUID;

public class Office{
    public UUID id;
    public Resource resource;
    public String role;
    public BigDecimal salary;
    public Department department;
    public Properties properties;
    public String dtStart;
    public String dtEnd;
    public List<Payment> listPayment;
}