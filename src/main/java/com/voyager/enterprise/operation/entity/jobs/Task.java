package com.voyager.enterprise.operation.entity.jobs;

import com.voyager.enterprise.people.entity.Employee;

import java.time.LocalDate;

public class Task {
    String desc;
    Employee responsible;
    LocalDate start;
    LocalDate end;
}
