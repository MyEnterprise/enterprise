package com.voyager.enterprise.manager.people.entity;

import com.voyager.enterprise.entity.Person;
import com.voyager.enterprise.manager.entity.Resource;

import java.time.LocalDate;
import java.util.List;

public class Employee extends Person {
    public List<Office> office;
    public String race;
    public String code;
    public String sex;
    public LocalDate dtBirth;
}