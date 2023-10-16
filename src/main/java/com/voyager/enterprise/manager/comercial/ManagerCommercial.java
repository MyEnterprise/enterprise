package com.voyager.enterprise.manager.comercial;

import com.voyager.enterprise.usercase.CaseGeneric;

public interface ManagerCommercial {
	public <T> T useCase(Class<T> usecase)  throws UnsupportedOperationException;
}
