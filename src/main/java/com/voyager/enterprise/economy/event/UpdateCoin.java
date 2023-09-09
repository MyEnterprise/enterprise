package com.voyager.enterprise.economy.event;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import com.voyager.enterprise.event.EventHandler;

@EventHandler(eventName = "com.voyager.enterprise.financial.entity.economy.event.UpdateCoin")
@Retention(RetentionPolicy.RUNTIME)
public @interface UpdateCoin {}
