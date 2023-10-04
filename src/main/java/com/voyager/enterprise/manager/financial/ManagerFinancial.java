package com.voyager.enterprise.manager.financial;

import com.voyager.enterprise.usercase.CaseGeneric;

public interface ManagerFinancial {
	public <T> CaseGeneric<T> useCase(T usecase);
}
