package com.le5n.annotations;

import com.le5n.messageInterfaces.MessageProvider;
import com.le5n.messageInterfaces.MessageRenderer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("messageRenderer")
public class StandardOutMessageRenderer implements MessageRenderer {
    private MessageProvider messageProvider;

    @Override
    public void render() {
        if (messageProvider == null) {
            throw new RuntimeException();
        }
        System.out.println(messageProvider.getMessage());
    }

    @Override
    @Autowired //this makes it a setter injection
    public void setMessageProvider(MessageProvider messageProvider) {
        this.messageProvider = messageProvider;
    }

    @Override
    public MessageProvider getMessageProvider() {
        return this.messageProvider;
    }
}
