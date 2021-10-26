package com.github.maikoncanuto.lumini.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.LinkedList;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDTO implements BaseDTO {

    private Object data;
    private List<ResponseErroDTO> erros = new LinkedList<>();

}
