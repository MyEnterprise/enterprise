package com.voyager.enterprise.financial.event;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import com.voyager.enterprise.event.EventHandler;

@EventHandler(eventName = "com.voyager.enterprise.financial.event.CreateBudget")
@Retention(RetentionPolicy.RUNTIME)
public @interface CreateBudget {
}
