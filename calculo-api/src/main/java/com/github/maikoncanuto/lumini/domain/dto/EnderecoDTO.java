package com.github.maikoncanuto.lumini.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class EnderecoDTO implements BaseDTO {

    private String endereco;
    private String bairro;
    private String cidade;
    private String estado;
    private String unidadeFederativa;
    private String cep;

}
