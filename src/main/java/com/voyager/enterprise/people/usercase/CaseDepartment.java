package com.voyager.enterprise.people.usercase;

import com.voyager.enterprise.people.entity.Department;

import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;

public interface CaseDepartment {
    public Department findById(UUID id);
    public Department findByPredicate(Predicate<Department> pred);
    public List<Department> listAll();
    public Department create(Department department);
    public Department update(Department department);
    public void remove(Department department);
}
