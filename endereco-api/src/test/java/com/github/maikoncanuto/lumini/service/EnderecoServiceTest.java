package com.github.maikoncanuto.lumini.service;

import com.github.maikoncanuto.lumini.domain.exception.BusinessException;
import com.github.maikoncanuto.lumini.domain.exception.NotFoundException;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EnderecoServiceTest {

    @Autowired
    private EnderecoService enderecoService;

    @Test
    void testEnderecoServiceFindEnderecoByCnpjParametroCorreto() throws BusinessException, NotFoundException {

        final var endereco = enderecoService.findEnderecoByCnpj("80331355000100");

        assertNotNull(endereco);
        assertNotNull(endereco.getEndereco());
        assertNotNull(endereco.getBairro());
        assertNotNull(endereco.getCep());
        assertNotNull(endereco.getCidade());
        assertNotNull(endereco.getEstado());
        assertNotNull(endereco.getUnidadeFederativa());

        assertEquals("73050169", endereco.getCep());
        assertEquals("Quadra Quadra 16 Conjunto I", endereco.getEndereco());
        assertEquals("Sobradinho", endereco.getBairro());
        assertEquals("Brasília", endereco.getCidade());
        assertEquals("Distrito Federal", endereco.getEstado());
        assertEquals("DF", endereco.getUnidadeFederativa());
    }

    @Test
    void testEnderecoServiceFindEnderecoByCnpjParametroEmBrancoException() {
        assertThrows(BusinessException.class, () -> {
            enderecoService.findEnderecoByCnpj("");
        });
    }

    @Test
    void testEnderecoServiceFindEnderecoByCnpjParametroNullException() {
        assertThrows(BusinessException.class, () -> {
            enderecoService.findEnderecoByCnpj(null);
        });
    }

    @Test
    void testEnderecoServiceFindEnderecoByCnpjParametroNotFoundException() {
        assertThrows(NotFoundException.class, () -> {
            enderecoService.findEnderecoByCnpj("35727366000141");
        });
    }

    @Test
    void testEnderecoServiceFindEnderecoByCnpjParametroInvalidoException() {
        assertThrows(BusinessException.class, () -> {
            enderecoService.findEnderecoByCnpj("35727366000169");
        });
    }

    @Test
    void testEnderecoServiceFindEnderecoByCnpjParametroInvalidoLetraException() {
        assertThrows(BusinessException.class, () -> {
            enderecoService.findEnderecoByCnpj("a");
        });
    }
}