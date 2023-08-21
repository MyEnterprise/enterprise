package com.voyager.enterprise.people.usercase;

import com.voyager.enterprise.people.entity.Employee;
import com.voyager.enterprise.people.entity.Office;

import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;

public interface CaseOffice {
    public Office findById(UUID id);
    public Office findByPredicate(Predicate<Office> pred);
    public List<Office> listAll();
    public Office create(Office office);
    public Office update(Office office);
    public void remove(Office office);
}
