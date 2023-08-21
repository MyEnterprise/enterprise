package com.voyager.enterprise.logistics.entity.storage.inventory;

import com.voyager.enterprise.logistics.entity.storage.Deposit;
import com.voyager.enterprise.util.Code;

public class InBound extends Bound{
    public Code<String> locationInvetory;

    public Code<String> getLocationInvetory() {
        return locationInvetory;
    }

    public void setLocationInvetory(Code<String> locationInvetory) {
        this.locationInvetory = locationInvetory;
    }
}
