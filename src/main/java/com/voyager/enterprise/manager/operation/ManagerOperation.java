package com.voyager.enterprise.manager.operation;

import com.voyager.enterprise.usercase.CaseGeneric;

public interface ManagerOperation {
	public <T> T useCase(Class<T> usecase);
}
