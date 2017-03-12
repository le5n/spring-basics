package com.le5n.constructor;

import com.le5n.messageInterfaces.MessageProvider;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctxConstr = new GenericXmlApplicationContext();
        ctxConstr.load("classpath:constructor/app-context-constructor.xml");
        ctxConstr.refresh();
        MessageProvider messageProviderConstr = ctxConstr.getBean("configurableMessageProvider", MessageProvider.class);
        System.out.println(messageProviderConstr.getMessage());
    }
}
