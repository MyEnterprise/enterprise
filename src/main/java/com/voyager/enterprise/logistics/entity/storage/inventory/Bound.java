package com.voyager.enterprise.logistics.entity.storage.inventory;

import com.voyager.enterprise.economy.entity.transaction.TransactionStatus;
import com.voyager.enterprise.logistics.entity.storage.inventory.bound.BoundStatus;
import com.voyager.enterprise.logistics.entity.storage.inventory.enums.BoundStatusEnum;

import java.util.List;

public class Bound {
    Shipments shipping;
    public BoundStatusEnum status;
    public List<BoundStatus> listStatus;
    // Obejto com os dados do trasnporte de transporte
}
