package com.voyager.enterprise.manager.logistics;

import com.voyager.enterprise.usercase.CaseGeneric;

public interface ManagerLogistics {
	public <T> CaseGeneric<T> useCase(T usecase);
}
