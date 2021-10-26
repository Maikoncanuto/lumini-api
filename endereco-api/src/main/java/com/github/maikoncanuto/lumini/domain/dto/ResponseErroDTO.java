package com.github.maikoncanuto.lumini.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResponseErroDTO implements BaseDTO {

    private String code;
    private String message;

}
