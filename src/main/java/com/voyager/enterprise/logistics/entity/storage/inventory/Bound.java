package com.voyager.enterprise.logistics.entity.storage.inventory;

import com.voyager.enterprise.logistics.entity.distribution.Expedition;
import com.voyager.enterprise.logistics.entity.storage.inventory.bound.BoundStatus;
import com.voyager.enterprise.logistics.entity.storage.inventory.bound.enums.BoundStatusEnum;
import com.voyager.enterprise.util.Code;

import java.util.List;
import java.util.UUID;

public class Bound {
    public UUID id;
    public Expedition expedition;
    public BoundStatusEnum status;
    public List<BoundStatus> listStatus;
    // Obejto com os dados do trasnporte de transporte
    public Code<String> locationInvetory;

    public Code<String> getLocationInvetory() {
        return locationInvetory;
    }

    public void setLocationInvetory(Code<String> locationInvetory) {
        this.locationInvetory = locationInvetory;
    }

    public Expedition getExpedition() {
        return expedition;
    }

    public void setExpedition(Expedition expedition) {
        this.expedition = expedition;
    }

    public BoundStatusEnum getStatus() {
        return status;
    }

    public void setStatus(BoundStatusEnum status) {
        this.status = status;
    }

    public List<BoundStatus> getListStatus() {
        return listStatus;
    }

    public void setListStatus(List<BoundStatus> listStatus) {
        this.listStatus = listStatus;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
