package com.voyager.enterprise.logistics.entity.storage;

import com.voyager.enterprise.logistics.entity.storage.inventory.InBound;
import com.voyager.enterprise.logistics.entity.storage.inventory.OutBound;
import com.voyager.enterprise.util.Code;

import java.util.List;

public class Inventory {
    public Code<String> code;

    // formato de organização
    // Aberto
    // Prateleiras
    // Pilhas

    public List<InBound> listInBound;
    public List<OutBound> listOutBound;


    public Code<String> getCode() {
        return code;
    }

    public void setCode(Code<String> code) {
        this.code = code;
    }

    public List<InBound> getListInBound() {
        return listInBound;
    }

    public void setListInBound(List<InBound> listInBound) {
        this.listInBound = listInBound;
    }

    public List<OutBound> getListOutBound() {
        return listOutBound;
    }

    public void setListOutBound(List<OutBound> listOutBound) {
        this.listOutBound = listOutBound;
    }
}
