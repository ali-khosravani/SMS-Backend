package com.p3soft.sms.exception;

import com.p3soft.sms.model.Message;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author Ali Kosravani
 * @since 1402/06/08
 */

public class ShowError extends Exception{
    @ExceptionHandler
    public Message exceptionHandler(Exception e){
        return new Message(true , e.getMessage());
    }
}
