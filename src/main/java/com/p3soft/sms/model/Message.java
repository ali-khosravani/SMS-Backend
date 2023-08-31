package com.p3soft.sms.model;

import lombok.*;

/**
 * @author  Ali Khosravani.
 * @version  1.0
 * @since 1402/06/08
 * Desc Message Class to show error message.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Message extends Throwable {
    private boolean hasError;
    private String message;
}
