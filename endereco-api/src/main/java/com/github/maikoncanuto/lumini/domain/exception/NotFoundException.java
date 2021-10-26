package com.github.maikoncanuto.lumini.domain.exception;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class NotFoundException extends Exception {

    public NotFoundException(final String exception) {
        super(exception);
    }

}
