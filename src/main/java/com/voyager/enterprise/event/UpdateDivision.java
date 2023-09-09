package com.voyager.enterprise.event;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@EventHandler(eventName = "com.voyager.enterprise.event.UpdateDivision")
@Retention(RetentionPolicy.RUNTIME)
public @interface UpdateDivision {
}
