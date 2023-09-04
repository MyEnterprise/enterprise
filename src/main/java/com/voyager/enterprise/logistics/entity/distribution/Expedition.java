package com.voyager.enterprise.logistics.entity.distribution;

import com.voyager.enterprise.logistics.entity.distribution.expedition.ExpeditionStatus;
import com.voyager.enterprise.logistics.entity.distribution.expedition.enums.ExpeditionEnum;
import com.voyager.enterprise.logistics.entity.storage.inventory.Shipment;
import com.voyager.enterprise.util.Code;

import java.util.List;
import java.util.UUID;

public class Expedition {
    public UUID id;

    public Code<String> locationInvetory;
    public Shipment shipment;
    public List<Transport> transport;
    public ExpeditionEnum type;
    public List<ExpeditionStatus> listStatus;

    public Shipment getShipments() {
        return shipment;
    }

    public Code<String> getLocationInvetory() {
        return locationInvetory;
    }

    public void setLocationInvetory(Code<String> locationInvetory) {
        this.locationInvetory = locationInvetory;
    }

    public void setShipments(Shipment shipment) {
        this.shipment = shipment;
    }
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public List<Transport> getTransport() {
        return transport;
    }

    public void setTransport(List<Transport> transport) {
        this.transport = transport;
    }

    public ExpeditionEnum getType() {
        return type;
    }

    public void setType(ExpeditionEnum type) {
        this.type = type;
    }

    public List<ExpeditionStatus> getListStatus() {
        return listStatus;
    }

    public void setListStatus(List<ExpeditionStatus> listStatus) {
        this.listStatus = listStatus;
    }
}
