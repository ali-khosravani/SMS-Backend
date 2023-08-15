package com.p3soft.sms.exception;

import com.p3soft.sms.model.Message;
import org.springframework.web.bind.annotation.ExceptionHandler;


public class ShowError extends Exception{
    @ExceptionHandler
    public Message exceptionHandler(Exception e){
        return new Message(true , e.getMessage());
    }
}
