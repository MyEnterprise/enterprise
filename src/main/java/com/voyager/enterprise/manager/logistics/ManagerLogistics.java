package com.voyager.enterprise.manager.logistics;

import com.voyager.enterprise.usercase.CaseGeneric;

public interface ManagerLogistics {
	public <T> T useCase(Class<T> usecase)  throws UnsupportedOperationException ;
}
