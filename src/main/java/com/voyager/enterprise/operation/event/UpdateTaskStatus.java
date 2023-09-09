package com.voyager.enterprise.operation.event;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import com.voyager.enterprise.event.EventHandler;

@EventHandler(eventName = "com.voyager.enterprise.operation.event.UpdateTaskStatus")
@Retention(RetentionPolicy.RUNTIME)
public @interface UpdateTaskStatus {}
