package com.voyager.enterprise.commercial.usercase;

import com.voyager.enterprise.commercial.entity.Order;

import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;

public interface CaseOrder {
    public Order findById(UUID id);
    public Order findByPredicate(Predicate<Order> pred);
    public List<Order> listAll();
    public Order create(Order order);
    public Order update(Order order);
    public void remove(Order order);
}
