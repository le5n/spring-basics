package com.le5n.constructor;

import com.le5n.messageInterfaces.MessageProvider;
import org.springframework.stereotype.Service;

public class ConfigurableMessageProvider implements MessageProvider{
    private String message;

    public ConfigurableMessageProvider(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
