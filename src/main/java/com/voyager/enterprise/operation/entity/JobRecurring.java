package com.voyager.enterprise.operation.entity;

import com.voyager.enterprise.operation.entity.jobs.enums.JobRecurringEnum;

public class JobRecurring extends Job{
    JobRecurringEnum type;

    public JobRecurringEnum getType() {
        return type;
    }

    public void setType(JobRecurringEnum type) {
        this.type = type;
    }
}
