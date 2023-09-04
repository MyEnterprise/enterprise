package com.voyager.enterprise.logistics.entity.distribution;

import com.voyager.enterprise.logistics.entity.distribution.transport.enums.TransportEnum;
import com.voyager.enterprise.logistics.entity.distribution.transport.TransportStatus;

import java.util.List;
import java.util.UUID;

public class Transport {
    public UUID id;
    public String carrier;
    public TransportEnum type;
    public List<TransportStatus> listStatus;
    public Address originAdress;
    public Address destinyAddress;
    public String desc;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public TransportEnum getType() {
        return type;
    }

    public void setType(TransportEnum type) {
        this.type = type;
    }

    public List<TransportStatus> getListStatus() {
        return listStatus;
    }

    public void setListStatus(List<TransportStatus> listStatus) {
        this.listStatus = listStatus;
    }

    public Address getOriginAdress() {
        return originAdress;
    }

    public void setOriginAdress(Address originAdress) {
        this.originAdress = originAdress;
    }

    public Address getDestinyAddress() {
        return destinyAddress;
    }

    public void setDestinyAddress(Address destinyAddress) {
        this.destinyAddress = destinyAddress;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
