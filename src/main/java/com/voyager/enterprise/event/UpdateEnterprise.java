package com.voyager.enterprise.event;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@EventHandler(eventName = "com.voyager.enterprise.event.UpdateEnterprise")
public @interface UpdateEnterprise {}
