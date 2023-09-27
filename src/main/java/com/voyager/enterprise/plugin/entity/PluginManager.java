package com.voyager.enterprise.plugin.entity;

import com.voyager.enterprise.server.Server;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Optional;
import java.util.function.Function;

public interface PluginManager {
    public PluginManager register( Object eventFind );
    public PluginManager register( Method eventMethod );
    public PluginManager register( String nameEvent, Function eventFunction);
    public void enablePlugin();
    public void disablePlugin();
    public Server getServer();
    public File getDataFolder();
    public void setConfig();
    public void getConfig();
    public void getConfigGlobal();
    public void getDB();
    public Optional<Plugin> findPluginByName(String name);
    public Optional<Plugin> findPluginByPackage(String name);
    public Optional<Class<?>> findPluginDependency(String name);
    public Emitter emit();
}