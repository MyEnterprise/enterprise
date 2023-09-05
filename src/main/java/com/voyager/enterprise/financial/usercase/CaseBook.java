package com.voyager.enterprise.financial.usercase;

import com.voyager.enterprise.financial.entity.Book;

import com.voyager.enterprise.usercase.CaseGeneric;

public interface CaseBook extends CaseGeneric<Book> {
    public Book mountBook();
}