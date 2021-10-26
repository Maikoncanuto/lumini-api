package com.github.maikoncanuto.lumini.resource;

import com.github.maikoncanuto.lumini.domain.dto.ResponseDTO;
import com.github.maikoncanuto.lumini.domain.exception.BusinessException;
import com.github.maikoncanuto.lumini.domain.exception.NotFoundException;
import com.github.maikoncanuto.lumini.service.EnderecoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequiredArgsConstructor
public class EnderecoResource {

    private final EnderecoService enderecoService;


    @GetMapping("/enderecos/{cnpj}")
    public ResponseEntity<ResponseDTO> findEnderecoByCnpj(@PathVariable("cnpj") final String cnpj) throws BusinessException, NotFoundException {

        final var endereco = enderecoService.findEnderecoByCnpj(cnpj);

        final var response = ResponseDTO
                .builder()
                .data(endereco)
                .build();

        return ok(response);
    }

}
