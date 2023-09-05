package com.voyager.enterprise.operation.entity.jobs.tasks;

import com.voyager.enterprise.operation.entity.jobs.JobStatus;
import com.voyager.enterprise.operation.entity.jobs.enums.JobStatusEnum;
import com.voyager.enterprise.operation.entity.jobs.tasks.enums.TaskStatusEnum;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class TaskStatus {
    public UUID id;
    public TaskStatusEnum status;
    public String desc;
    public LocalDate dt;
    public Map<String,String> attributes;
}
