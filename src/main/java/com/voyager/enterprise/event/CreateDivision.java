package com.voyager.enterprise.event;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//https://dernegocios.com.br/tres-tipos-de-operacoes-que-podem-fazer-sua-empresa-crescer/
@EventHandler(eventName = "com.voyager.enterprise.event.CreateDivision")
@Retention(RetentionPolicy.RUNTIME)
public @interface CreateDivision {}
