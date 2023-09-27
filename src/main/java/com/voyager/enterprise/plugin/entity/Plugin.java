package com.voyager.enterprise.plugin.entity;

import java.util.List;
import java.util.Map.Entry;
import java.util.Optional;


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
