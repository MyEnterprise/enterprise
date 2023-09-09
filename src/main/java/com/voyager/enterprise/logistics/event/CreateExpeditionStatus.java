package com.voyager.enterprise.logistics.event;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import com.voyager.enterprise.event.EventHandler;

@EventHandler(eventName = "com.voyager.enterprise.logistics.event.CreateExpeditionStatus")
@Retention(RetentionPolicy.RUNTIME)
public @interface CreateExpeditionStatus {}
