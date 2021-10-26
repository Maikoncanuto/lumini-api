package com.github.maikoncanuto.lumini.resource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class EnderecoResourceTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testEnderecoResourceFindEnderecoByCnpjParametroCorreto() throws Exception {
        mockMvc.perform(get("/enderecos/{cnpj}", "80331355000100").contentType(APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.data").exists())
                .andExpect(jsonPath("$.data.endereco").isNotEmpty())
                .andExpect(jsonPath("$.data.bairro").isNotEmpty())
                .andExpect(jsonPath("$.data.cidade").isNotEmpty())
                .andExpect(jsonPath("$.data.estado").isNotEmpty())
                .andExpect(jsonPath("$.data.unidadeFederativa").isNotEmpty())
                .andExpect(jsonPath("$.data.cep").isNotEmpty())
                .andExpect(jsonPath("$.erros").doesNotExist())
                .andExpect(jsonPath("$.data.endereco").value("Quadra Quadra 16 Conjunto I"))
                .andExpect(jsonPath("$.data.bairro").value("Sobradinho"))
                .andExpect(jsonPath("$.data.cidade").value("Brasília"))
                .andExpect(jsonPath("$.data.estado").value("Distrito Federal"))
                .andExpect(jsonPath("$.data.unidadeFederativa").value("DF"))
                .andExpect(jsonPath("$.data.cep").value("73050169"));
    }

    @Test
    void testEnderecoResourceFindEnderecoByCnpjParametroCnpjErrado() throws Exception {
        mockMvc.perform(get("/enderecos/{cnpj}", "803313550001000").contentType(APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isBadRequest())
                .andExpect(jsonPath("$.erros").exists())
                .andExpect(jsonPath("$.erros[*].code").isNotEmpty())
                .andExpect(jsonPath("$.erros[*].message").isNotEmpty())
                .andExpect(jsonPath("$.erros[*].code").value("400"))
                .andExpect(jsonPath("$.data").doesNotExist());
    }

    @Test
    void testEnderecoResourceFindEnderecoByCnpjParametroCnpjQueNaoExiste() throws Exception {
        mockMvc.perform(get("/enderecos/{cnpj}", "35727366000141").contentType(APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isNotFound())
                .andExpect(jsonPath("$.erros").exists())
                .andExpect(jsonPath("$.erros[*].code").isNotEmpty())
                .andExpect(jsonPath("$.erros[*].message").isNotEmpty())
                .andExpect(jsonPath("$.erros[*].code").value("404"))
                .andExpect(jsonPath("$.data").doesNotExist());
    }


}
