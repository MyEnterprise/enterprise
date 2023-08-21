package com.voyager.enterprise.entity;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Enterprise extends Person{
    public String code;
    public String name;
    public List<String> listSegment;
    public Map<String,String> attributes;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getListSegment() {
        return listSegment;
    }

    public void setListSegment(List<String> listSegment) {
        this.listSegment = listSegment;
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, String> attributes) {
        this.attributes = attributes;
    }
}