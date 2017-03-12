package com.le5n.annotations;

import com.le5n.messageInterfaces.MessageProvider;
import com.le5n.messageInterfaces.MessageRenderer;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
//        ctx.load("classpath:annotations/app-context-annotation.xml");
//        ctx.refresh();
//        MessageProvider messageProvider = ctx.getBean("messageProvider", MessageProvider.class);
//        System.out.println(messageProvider.getMessage());
//
//        //setter injection

//        GenericXmlApplicationContext ctxSetter = new GenericXmlApplicationContext();
//        ctxSetter.load("classpath:annotations/app-context-annotation.xml");
//        ctxSetter.refresh();
//
//        MessageRenderer messageRenderer = ctxSetter.getBean("messageRenderer", MessageRenderer.class);
//        messageRenderer.render();

        //constructor injection
        GenericXmlApplicationContext ctxConstr = new GenericXmlApplicationContext();
        ctxConstr.load("classpath:constructor/app-context-constr-annotations.xml");
        ctxConstr.refresh();
        MessageProvider messageProviderConstr = ctxConstr.getBean("configurableMessageProvider", MessageProvider.class);
        System.out.println(messageProviderConstr.getMessage());
    }
}
