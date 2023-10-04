package com.voyager.enterprise.manager.financial;

import com.voyager.enterprise.usercase.CaseGeneric;

public interface ManagerFinancial {
	public <T> T useCase(Class<T> usecase);
}
