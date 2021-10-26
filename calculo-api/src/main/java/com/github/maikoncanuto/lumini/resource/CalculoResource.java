package com.github.maikoncanuto.lumini.resource;

import com.github.maikoncanuto.lumini.domain.dto.CalculoDTO;
import com.github.maikoncanuto.lumini.domain.dto.ResponseDTO;
import com.github.maikoncanuto.lumini.domain.exception.BusinessException;
import com.github.maikoncanuto.lumini.service.CalculoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequiredArgsConstructor
public class CalculoResource {

    private final CalculoService calculoService;

    @PostMapping("/calculos")
    @ResponseBody
    @ResponseStatus(OK)
    public ResponseDTO calculoMedia(@RequestBody final CalculoDTO calculo) throws BusinessException {

        final var calculoResultado = calculoService.calcularMedia(calculo);

        return ResponseDTO
                .builder()
                .data(calculoResultado)
                .build();
    }
}
