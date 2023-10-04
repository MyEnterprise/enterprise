package com.voyager.enterprise.manager.people;

import com.voyager.enterprise.usercase.CaseGeneric;

public interface ManagerPeople {
	public <T> CaseGeneric<T> useCase(T usecase);
}
