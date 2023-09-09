package com.voyager.enterprise.event;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@EventHandler(eventName = "com.voyager.enterprise.event.UpdateIncorporation")
@Retention(RetentionPolicy.RUNTIME)
public @interface UpdateIncorporation {}
