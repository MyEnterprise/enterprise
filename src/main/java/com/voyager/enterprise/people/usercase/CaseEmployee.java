package com.voyager.enterprise.people.usercase;

import com.voyager.enterprise.people.entity.Department;
import com.voyager.enterprise.people.entity.Employee;

import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;

public interface CaseEmployee {
    public Employee findById(UUID id);
    public Employee findByPredicate(Predicate<Employee> pred);
    public List<Employee> listAll();
    public Employee create(Employee employment);
    public Employee update(Employee employee);
    public void remove(Employee department);
}
