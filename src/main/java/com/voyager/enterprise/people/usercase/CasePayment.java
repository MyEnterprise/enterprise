package com.voyager.enterprise.people.usercase;

import com.voyager.enterprise.people.entity.Office;
import com.voyager.enterprise.people.entity.Payment;

import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;

public interface CasePayment {
    public Payment findById(UUID id);
    public Payment findByPredicate(Predicate<Payment> pred);
    public List<Payment> listAll();
    public Payment create(Payment payment);
    public Payment update(Payment payment);
    public void remove(Payment payment);
}
