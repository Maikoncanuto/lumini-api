package com.github.maikoncanuto.lumini.resource;

import com.github.maikoncanuto.lumini.domain.dto.CalculoDTO;
import com.github.maikoncanuto.lumini.domain.dto.ResponseDTO;
import com.github.maikoncanuto.lumini.domain.exception.BusinessException;
import com.github.maikoncanuto.lumini.service.CalculoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CalculoResource {

    private final CalculoService calculoService;

    @PostMapping("/calculos")
    public ResponseEntity<ResponseDTO> calculoMedia(@RequestBody final CalculoDTO calculo) throws BusinessException {

        final var calculoResultado = calculoService.calcularMedia(calculo);

        final var response = ResponseDTO
                .builder()
                .data(calculoResultado)
                .build();

        return ok(response);
    }
}
