package com.github.maikoncanuto.lumini.resource;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.maikoncanuto.lumini.domain.dto.CalculoDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class CalculoResourceTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void testCalculoResourceParametroCorreto() throws Exception {
        final var calculo = new CalculoDTO();
        calculo.setValorB(2d);
        calculo.setValorA(2d);

        mockMvc.perform(post("/calculos")
                        .content(objectMapper.writeValueAsBytes(calculo))
                        .contentType(APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.data").exists())
                .andExpect(jsonPath("$.data.resultado").isNotEmpty())
                .andExpect(jsonPath("$.erros").doesNotExist());
    }

    @Test
    void testCalculoResourceParametroNulo() throws Exception {
        final var calculo = new CalculoDTO();

        mockMvc.perform(post("/calculos")
                        .content(objectMapper.writeValueAsBytes(calculo))
                        .contentType(APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isBadRequest())
                .andExpect(jsonPath("$.data").doesNotExist())
                .andExpect(jsonPath("$.erros").exists())
                .andExpect(jsonPath("$.erros[*].code").isNotEmpty());
    }

}
