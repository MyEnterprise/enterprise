package com.voyager.enterprise.commercial.event;

import com.voyager.enterprise.commercial.entity.Buyer;
import com.voyager.enterprise.event.EventHandler;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.function.Predicate;

@EventHandler(eventName = "com.voyager.enterprise.commercial.event.CreateBuyer")
@Retention(RetentionPolicy.RUNTIME)
public @interface CreateBuyer {}
