package com.voyager.enterprise.financial.usercase;

import com.voyager.enterprise.financial.entity.Budget;
import com.voyager.enterprise.usercase.CaseGeneric;

public interface CaseBudget extends CaseGeneric<Budget> {
    public Budget mountBudget();
}
