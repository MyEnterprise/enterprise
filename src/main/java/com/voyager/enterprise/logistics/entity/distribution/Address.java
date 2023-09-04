package com.voyager.enterprise.logistics.entity.distribution;

import java.util.UUID;

public class Address {
    public UUID id;
    public boolean main;
    public String country;
    public String stateOrProvince;
    public String city;
    public String districtOrBurgh;
    public String street;
    public String number;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public boolean isMain() {
        return main;
    }

    public void setMain(boolean main) {
        this.main = main;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStateOrProvince() {
        return stateOrProvince;
    }

    public void setStateOrProvince(String stateOrProvince) {
        this.stateOrProvince = stateOrProvince;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrictOrBurgh() {
        return districtOrBurgh;
    }

    public void setDistrictOrBurgh(String districtOrBurgh) {
        this.districtOrBurgh = districtOrBurgh;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
