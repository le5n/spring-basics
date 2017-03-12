package com.le5n.annotations;

import com.le5n.message.MessageProvider;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:app-context-annotation.xml");
        ctx.refresh();
        MessageProvider messageProvider = ctx.getBean("messageProvider", MessageProvider.class);
        System.out.println(messageProvider.getMessage());
    }
}
