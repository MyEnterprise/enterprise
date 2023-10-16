package com.voyager.enterprise.manager.people;

import com.voyager.enterprise.usercase.CaseGeneric;

public interface ManagerPeople {
	public <T> T useCase(Class<T> usecase)  throws UnsupportedOperationException ;
}
