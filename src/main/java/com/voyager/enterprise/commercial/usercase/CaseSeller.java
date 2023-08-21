package com.voyager.enterprise.commercial.usercase;

import com.voyager.enterprise.commercial.entity.Seller;

import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;

public interface CaseSeller {
    public Seller findById(UUID id);
    public Seller findByPredicate(Predicate<Seller> pred);
    public List<Seller> listAll();
    public Seller create(Seller seller);
    public Seller update(Seller seller);
    public void remove(Seller seller);
}
