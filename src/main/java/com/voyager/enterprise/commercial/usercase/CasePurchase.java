package com.voyager.enterprise.commercial.usercase;

import com.voyager.enterprise.commercial.entity.Purchase;

import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;

public interface CasePurchase {
    public Purchase findById(UUID id);
    public Purchase findByPredicate(Predicate<Purchase> pred);
    public List<Purchase> listAll();
    public Purchase create(Purchase purchase);
    public Purchase update(Purchase purchase);
    public void remove(Purchase purchase);
}
