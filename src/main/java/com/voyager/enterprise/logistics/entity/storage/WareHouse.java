package com.voyager.enterprise.logistics.entity.storage;

import com.voyager.enterprise.logistics.entity.distribution.Address;
import com.voyager.enterprise.util.Code;

import java.util.List;

public class WareHouse {
    public Code<String> code;
    public Address local;
    public List<Deposit> listDeposit;

    public Code<String> getCode() {
        return code;
    }

    public void setCode(Code<String> code) {
        this.code = code;
    }

    public Address getLocal() {
        return local;
    }

    public void setLocal(Address local) {
        this.local = local;
    }

    public List<Deposit> getListDeposit() {
        return listDeposit;
    }

    public void setListDeposit(List<Deposit> listDeposit) {
        this.listDeposit = listDeposit;
    }
}
