package com.voyager.enterprise.logistics.entity.storage.inventory;

import com.voyager.enterprise.logistics.entity.distribution.Expedition;
import com.voyager.enterprise.logistics.entity.storage.inventory.bound.BoundStatus;
import com.voyager.enterprise.logistics.entity.storage.inventory.bound.enums.BoundStatusEnum;

import java.util.List;

public class Bound {
    public Expedition expedition;
    public BoundStatusEnum status;
    public List<BoundStatus> listStatus;
    // Obejto com os dados do trasnporte de transporte


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
}
