package com.voyager.enterprise.server;

import com.voyager.enterprise.manager.comercial.ManagerCommercial;
import com.voyager.enterprise.manager.economy.ManagerEconomy;
import com.voyager.enterprise.manager.financial.ManagerFinancial;
import com.voyager.enterprise.manager.logistics.ManagerLogistics;
import com.voyager.enterprise.manager.people.ManagerPeople;
import com.voyager.enterprise.manager.project.ManagerProject;

import java.util.Properties;

public interface Server {
    public ManagerCommercial getManagerCommercial();
    public ManagerEconomy getManagerEconomy();
    public ManagerFinancial getManagerFinancial();
    public ManagerLogistics getManagerLogistics();
    public ManagerPeople getManagerPeople();
    public ManagerProject getManagerProject();
    public Properties getConfig();
}
