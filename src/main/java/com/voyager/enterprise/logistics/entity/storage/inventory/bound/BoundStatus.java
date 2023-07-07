package com.voyager.enterprise.logistics.entity.storage.inventory.bound;


import com.voyager.enterprise.logistics.entity.storage.inventory.enums.BoundStatusEnum;

import java.time.LocalDate;
import java.util.Properties;

public class BoundStatus {
    public BoundStatusEnum status;
    public String desc;
    public LocalDate dt;
    public Properties properties;
}
