package com.voyager.enterprise.manager;

public interface ManagerEnterprise {
	public <T> T useCase(Class<T> usecase)  throws UnsupportedOperationException;
}
