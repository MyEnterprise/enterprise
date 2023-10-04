package com.voyager.enterprise.manager.project;

import com.voyager.enterprise.usercase.CaseGeneric;

public interface ManagerProject {
	public <T> CaseGeneric<T> useCase(T usecase);
}
