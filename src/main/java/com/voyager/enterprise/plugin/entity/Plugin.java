package com.voyager.enterprise.plugin.entity;

public interface Plugin {
    public void initialize(PluginManager manager);
    public void pause();
    public void resume();
    public void emit(Emitter emit);
    public void getPluginDescription();
    public void reloadConfig();
    public void onCommand();
    public boolean isInitialized();
    public void getName();

}
