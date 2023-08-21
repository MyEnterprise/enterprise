package com.voyager.enterprise.commercial.event;

import com.voyager.enterprise.commercial.entity.Buyer;
import com.voyager.enterprise.event.EventHandler;

import java.util.function.Predicate;

@EventHandler(eventName = "com.voyager.enterprise.commercial.event.CreateBuyer")
public @interface CreateBuyer {}
