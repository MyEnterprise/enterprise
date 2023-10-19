package com.voyager.enterprise.entity;

import com.voyager.enterprise.logistics.entity.distribution.Address;
import com.voyager.enterprise.entity.person.Contact;
import com.voyager.enterprise.plugin.tax.entity.TaxIdentification;

import java.util.List;
import java.util.UUID;

public class Person {
    public UUID id;
    public String name;
    public TaxIdentification identification;
    public List<Address> listAddress;
    public List<Contact> listContact;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TaxIdentification getIdentification() {
        return identification;
    }

    public void setIdentification(TaxIdentification identification) {
        this.identification = identification;
    }

    public List<Address> getListAddress() {
        return listAddress;
    }

    public void setListAddress(List<Address> listAddress) {
        this.listAddress = listAddress;
    }

    public List<Contact> getListContact() {
        return listContact;
    }

    public void setListContact(List<Contact> listContact) {
        this.listContact = listContact;
    }
}
