package com.github.maikoncanuto.lumini.domain.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CalculoResultadoDTO implements BaseDTO {

    private Double resultado;

}
