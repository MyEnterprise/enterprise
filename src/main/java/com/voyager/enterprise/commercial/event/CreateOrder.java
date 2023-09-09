package com.voyager.enterprise.commercial.event;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import com.voyager.enterprise.event.EventHandler;

@EventHandler(eventName = "com.voyager.enterprise.commercial.event.CreateOrder")
@Retention(RetentionPolicy.RUNTIME)
public @interface CreateOrder {
}
