package com.voyager.enterprise.commercial.usercase;

import com.voyager.enterprise.commercial.entity.Offer;

import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;

public interface CaseOffer {
    public Offer findById(UUID id);
    public Offer findByPredicate(Predicate<Offer> pred);
    public List<Offer> listAll();
    public Offer create(Offer offer);
    public Offer update(Offer offer);
    public void remove(Offer offer);
}
