package com.voyager.enterprise.usercase;

import com.voyager.enterprise.commercial.entity.Buyer;

import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;

public interface CaseGeneric<T>{
    public T findById(UUID id);
    public T findByPredicate(Predicate<T> pred);
    public List<T> listAll();
    public T create(T data);
    public T update(T data);
    public void remove(T data);
}
