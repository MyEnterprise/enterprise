package com.voyager.enterprise.entity;

import com.voyager.enterprise.economy.entity.Transaction;

public class Incorporation {

	private Enterprise acquiring;
	private Enterprise acquired;
	private Transaction cost;

	public Enterprise getAcquiring() {
		return acquiring;
	}
	public void setAcquiring(Enterprise acquiring) {
		this.acquiring = acquiring;
	}
	public Enterprise getAcquired() {
		return acquired;
	}
	public void setAcquired(Enterprise acquired) {
		this.acquired = acquired;
	}
	public Transaction getCost() {
		return cost;
	}
	public void setCost(Transaction cost) {
		this.cost = cost;
	}
	
}
