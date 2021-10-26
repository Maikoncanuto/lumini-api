package com.github.maikoncanuto.lumini.service;

import com.github.maikoncanuto.lumini.domain.dto.CalculoDTO;
import com.github.maikoncanuto.lumini.domain.exception.BusinessException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CalculoServiceTest {

    @Autowired
    private CalculoService calculoService;

    @Test
    void testCalculoServiceCalcularMediaCorreto() throws BusinessException {

        final var calculo = new CalculoDTO();
        calculo.setValorA(2d);
        calculo.setValorB(2d);

        final var calcularMedia = calculoService.calcularMedia(calculo);

        assertNotNull(calcularMedia);
        assertNotNull(calcularMedia.getResultado());
        assertEquals(2d, calcularMedia.getResultado());
    }

    @Test
    void testCalculoServiceCacularMediaParametroNuloException() {
        assertThrows(BusinessException.class, () -> {
            calculoService.calcularMedia(null);
        });
    }

    @Test
    void testCalculoServiceCacularMediaParametrosNuloException() {
        assertThrows(BusinessException.class, () -> {
            final var calculo = new CalculoDTO();
            calculoService.calcularMedia(calculo);
        });
    }
}