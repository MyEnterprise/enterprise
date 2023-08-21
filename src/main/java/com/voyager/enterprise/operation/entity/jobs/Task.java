package com.voyager.enterprise.operation.entity.jobs;

import com.voyager.enterprise.people.entity.Employee;

import java.time.LocalDate;

public class Task {
    String desc;
    Employee responsible;
    LocalDate start;
    LocalDate end;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Employee getResponsible() {
        return responsible;
    }

    public void setResponsible(Employee responsible) {
        this.responsible = responsible;
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
