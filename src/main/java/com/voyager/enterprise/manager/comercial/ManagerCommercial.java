package com.voyager.enterprise.manager.comercial;

import com.voyager.enterprise.usercase.CaseGeneric;

public interface ManagerCommercial {
	public <T> CaseGeneric<T> useCase(T usecase);
}
