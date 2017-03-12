package com.le5n.constructor;

import com.le5n.messageInterfaces.MessageProvider;

public class HelloWorldMessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "Hello world!";
    }
}
