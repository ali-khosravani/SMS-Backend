package com.p3soft.sms.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Message extends Throwable {
    public Message(boolean hasError, String message) {
        this.hasError = hasError;
        this.message = message;
    }

    private boolean hasError;
    private String message;
}
