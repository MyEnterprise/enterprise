package com.voyager.enterprise.people.event;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import com.voyager.enterprise.event.EventHandler;

@EventHandler(eventName = "com.voyager.enterprise.people.event.UpdateDepartment")
@Retention(RetentionPolicy.RUNTIME)
public @interface UpdateDepartment {}
