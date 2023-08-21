package com.voyager.enterprise.logistics.entity.distribution;

import com.voyager.enterprise.logistics.entity.storage.inventory.Shipments;

public class Expedition {
    Shipments shipments;
    public Transport transport;
    // Status e tipo


    public Shipments getShipments() {
        return shipments;
    }

    public void setShipments(Shipments shipments) {
        this.shipments = shipments;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }
}
