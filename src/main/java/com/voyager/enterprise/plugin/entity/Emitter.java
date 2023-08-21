package com.voyager.enterprise.plugin.entity;

public interface Emitter {
    public Emitter withName(String name);
    public Emitter withData(Object data);
    public String getName();
    public Object getData();
    public void send();
}
