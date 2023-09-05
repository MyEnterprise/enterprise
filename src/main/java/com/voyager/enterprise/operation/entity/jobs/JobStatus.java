package com.voyager.enterprise.operation.entity.jobs;

import com.voyager.enterprise.logistics.entity.distribution.transport.enums.TransportStatusEnum;
import com.voyager.enterprise.operation.entity.jobs.enums.JobStatusEnum;

import java.time.LocalDate;
import java.util.Map;
import java.util.UUID;

public class JobStatus {
    public UUID id;
    public JobStatusEnum status;
    public String desc;
    public LocalDate dt;
    public Map<String,String> attributes;
}
