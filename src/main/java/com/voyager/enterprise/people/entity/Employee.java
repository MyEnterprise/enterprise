package com.voyager.enterprise.people.entity;

import com.voyager.enterprise.entity.Person;

import java.time.LocalDate;
import java.util.List;

public class Employee extends Person {
    public List<Office> office;
    public String race;
    public String code;
    public String sex;
    public LocalDate dtBirth;
}