package com.voyager.enterprise.util;

import java.awt.*;

public class Code<T> {
	
	private String reference;
	private T payload;
    
    public T getPayload(){
        return this.payload;
    }
    public Image genQRCode(){
        return null;
    }
    public Image genBarCode(){
        return null;
    }
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public void setPayload(T payload) {
		this.payload = payload;
	}
}
