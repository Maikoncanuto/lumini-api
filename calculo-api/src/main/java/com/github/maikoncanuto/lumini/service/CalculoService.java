package com.github.maikoncanuto.lumini.service;

import com.github.maikoncanuto.lumini.domain.dto.CalculoDTO;
import com.github.maikoncanuto.lumini.domain.dto.CalculoResultadoDTO;
import com.github.maikoncanuto.lumini.domain.exception.BusinessException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import static java.lang.String.format;

@Service
@Slf4j
public class CalculoService {

    public CalculoResultadoDTO calcularMedia(final CalculoDTO calculo) throws BusinessException {

        if (calculo == null || calculo.getValorA() == null || calculo.getValorB() == null) {
            log.warn("[CalculoService:calcularMedia:18] - Parametro não informado");
            throw new BusinessException("Parametro 'Calculo' precisa está preenchido na request");
        }

        final var resultado = (calculo.getValorA() + calculo.getValorB()) / 2;

        log.info(format("[CalculoService:calcularMedia:24] - Media calculada com sucesso: %s", resultado));

        return CalculoResultadoDTO.builder()
                .resultado(resultado)
                .build();
    }
}
