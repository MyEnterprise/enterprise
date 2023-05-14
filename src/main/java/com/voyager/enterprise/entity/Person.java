package com.voyager.enterprise.entity;

import com.voyager.enterprise.entity.person.Address;
import com.voyager.enterprise.entity.person.Contact;
import com.voyager.enterprise.gateway.tax.entity.TaxIdentificationEntity;

import java.util.List;
import java.util.UUID;

public class Person {
    public UUID id;
    public String name;
    public TaxIdentificationEntity identification;
    public List<Address> listAddress;
    public List<Contact> listContact;
}
