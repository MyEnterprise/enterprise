package com.voyager.enterprise.gateway.entity;

public interface Gatewary{
    public void initialize(GatewaryManager manager);
    public void reloadConfig();
    public void onCommand();
    public void onLoad();
    public void onDisable();
    public void onEnable();
    public boolean isInitialized();
    public void getName();
    public void emit();
}
