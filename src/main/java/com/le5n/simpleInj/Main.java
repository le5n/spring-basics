package com.le5n.simpleInj;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("simpleInj/app-context-simple.xml");
        ctx.refresh();

        Person person = (Person) ctx.getBean("person");
        System.out.println(person);
    }
}
