package com.voyager.enterprise.commercial.usercase;

import com.voyager.enterprise.commercial.entity.Sale;

import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;

public interface CaseSale {
    public Sale findById(UUID id);
    public Sale findByPredicate(Predicate<Sale> pred);
    public List<Sale> listAll();
    public Sale create(Sale sale);
    public Sale update(Sale sale);
    public void remove(Sale sale);
}
