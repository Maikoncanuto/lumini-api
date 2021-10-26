package com.github.maikoncanuto.lumini.resource.handler;

import com.github.maikoncanuto.lumini.domain.dto.ResponseDTO;
import com.github.maikoncanuto.lumini.domain.dto.ResponseErroDTO;
import com.github.maikoncanuto.lumini.domain.exception.BusinessException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import static java.lang.String.format;
import static java.util.Collections.singletonList;
import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.ResponseEntity.status;

@RestControllerAdvice
@Slf4j
public class GenericExceptionHandler {

    @ExceptionHandler(value = {BusinessException.class})
    public ResponseEntity<ResponseDTO> resourcePathParamInvalid(final BusinessException exception, final WebRequest webRequest) {
        final var response = ResponseDTO.builder()
                .erros(singletonList(ResponseErroDTO
                        .builder()
                        .message(format("REQUEST_INVALID: %s", exception.getMessage()))
                        .code(String.valueOf(BAD_REQUEST.value()))
                        .build()))
                .build();

        log.warn(format("[GenericExceptionHandler:resourcePathParamInvalid:33] - Exception: %s", exception.getMessage()));

        return status(BAD_REQUEST).body(response);
    }
}
