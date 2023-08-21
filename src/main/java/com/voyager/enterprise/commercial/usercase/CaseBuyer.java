package com.voyager.enterprise.commercial.usercase;

import com.voyager.enterprise.commercial.entity.Buyer;

import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;

public interface CaseBuyer {
    public Buyer findById(UUID id);
    public Buyer findByPredicate(Predicate<Buyer> pred);
    public List<Buyer> listAll();
    public Buyer create(Buyer buyer);
    public Buyer update(Buyer buyer);
    public void remove(Buyer buyer);
}
