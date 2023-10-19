package com.voyager.enterprise.commercial.entity;

import com.voyager.enterprise.economy.entity.Merchandise;
import com.voyager.enterprise.util.Code;

import java.util.Map;
import java.util.UUID;

public class Offer {
	
	private UUID id;
    private Code<String> code;
    private Map<String,String> attributes;
    private String desc;
    
    public Merchandise merchandise;
    public String name;
    

    
}
