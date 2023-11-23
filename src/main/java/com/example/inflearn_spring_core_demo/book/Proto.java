package com.example.inflearn_spring_core_demo.book;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component @Scope(value="prototype" , proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Proto {

}
