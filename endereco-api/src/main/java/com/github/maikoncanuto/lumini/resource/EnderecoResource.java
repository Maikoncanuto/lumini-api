package com.github.maikoncanuto.lumini.resource;

import com.github.maikoncanuto.lumini.domain.dto.ResponseDTO;
import com.github.maikoncanuto.lumini.domain.exception.BusinessException;
import com.github.maikoncanuto.lumini.domain.exception.NotFoundException;
import com.github.maikoncanuto.lumini.service.EnderecoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequiredArgsConstructor
public class EnderecoResource {

    private final EnderecoService enderecoService;

    @GetMapping("/enderecos/{cnpj}")
    @ResponseBody
    @ResponseStatus(OK)
    public ResponseDTO findEnderecoByCnpj(@PathVariable("cnpj") final String cnpj) throws BusinessException, NotFoundException {

        final var endereco = enderecoService.findEnderecoByCnpj(cnpj);

        return ResponseDTO
                .builder()
                .data(endereco)
                .build();
    }
}
