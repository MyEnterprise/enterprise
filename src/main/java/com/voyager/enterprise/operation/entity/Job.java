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

    public List<Merchandise> getFeedstocks() {
        return feedstocks;
    }

    public void setFeedstocks(List<Merchandise> feedstocks) {
        this.feedstocks = feedstocks;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public LocalDate getStart() {
        return start;
    }

    public void setStart(LocalDate start) {
        this.start = start;
    }

    public LocalDate getEnd() {
        return end;
    }

    public void setEnd(LocalDate end) {
        this.end = end;
    }
}
