package com.voyager.enterprise.manager.economy;

import com.voyager.enterprise.usercase.CaseGeneric;

public interface ManagerEconomy {
	public <T> CaseGeneric<T> useCase(T usecase);
}
