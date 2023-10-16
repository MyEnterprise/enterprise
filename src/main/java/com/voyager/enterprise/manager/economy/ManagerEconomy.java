package com.voyager.enterprise.manager.economy;

import com.voyager.enterprise.usercase.CaseGeneric;

public interface ManagerEconomy {
	public <T> T useCase(Class<T> usecase)  throws UnsupportedOperationException ;
}
