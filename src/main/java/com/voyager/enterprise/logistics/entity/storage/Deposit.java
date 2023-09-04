package com.voyager.enterprise.logistics.entity.storage;

import com.voyager.enterprise.logistics.entity.storage.enums.DepositEnum;
import com.voyager.enterprise.util.Code;

import java.util.List;

public class Deposit {

    public Code<String> code;
    public Inventory inventory;
    public List<DepositEnum> type;

    public Code<String> getCode() {
        return code;
    }

    public void setCode(Code<String> code) {
        this.code = code;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public List<DepositEnum> getType() {
        return type;
    }

    public void setType(List<DepositEnum> type) {
        this.type = type;
    }
}
