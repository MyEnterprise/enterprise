package com.voyager.enterprise.operation.entity;

import com.voyager.enterprise.commercial.entity.Order;
import com.voyager.enterprise.economy.entity.Merchandise;
import com.voyager.enterprise.operation.entity.jobs.Task;

import java.time.LocalDate;
import java.util.List;

public class Job extends Order{
    List<Merchandise> feedstocks;
    List<Task> tasks;
    LocalDate start;
    LocalDate end;

}
