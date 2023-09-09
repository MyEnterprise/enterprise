package com.voyager.enterprise.plugin.event;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import com.voyager.enterprise.event.EventHandler;

@EventHandler(eventName = "com.voyager.enterprise.plugin.event.PluginInitialize")
@Retention(RetentionPolicy.RUNTIME)
public @interface PluginInitialize {}
