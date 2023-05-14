package com.voyager.enterprise.gateway.entity;

public interface GatewaryManager {
    public GatewaryManager register( /*EventListener listener*/);
    public void enablePlugin();
    public void disablePlugin();
    public void setConfig();
    public void getConfig();
    public void getConfigGlobal();
    public void getORM();
    public void findGatewary();
    public void emit();
}