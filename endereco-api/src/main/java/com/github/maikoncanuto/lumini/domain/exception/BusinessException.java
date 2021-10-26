package com.github.maikoncanuto.lumini.domain.exception;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BusinessException extends Exception {

    public BusinessException(final String exception) {
        super(exception);
    }
}
