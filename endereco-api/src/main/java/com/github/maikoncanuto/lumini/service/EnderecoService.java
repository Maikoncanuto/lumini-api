package com.github.maikoncanuto.lumini.service;

import com.github.maikoncanuto.lumini.domain.dto.EnderecoDTO;
import com.github.maikoncanuto.lumini.domain.exception.BusinessException;
import com.github.maikoncanuto.lumini.domain.exception.NotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import static java.lang.String.format;

@Service
@Slf4j
public class EnderecoService {

    private final DocumentoService documentoService;

    public EnderecoService(DocumentoService documentoService) {
        this.documentoService = documentoService;
    }

    public EnderecoDTO findEnderecoByCnpj(final String cnpj) throws BusinessException, NotFoundException {

        if (cnpj == null || cnpj.isBlank()) {
            log.warn("[EnderecoService:findEnderecoByCnpj:22] - Parametro não informado");
            throw new BusinessException("Parametro 'CNPJ' precisa está preenchido na request");
        }

        if (!documentoService.isCNPJ(cnpj)) {
            log.warn(format("[EnderecoService:findEnderecoByCnpj:27] - CNPJ, %s,  informado não está válido", cnpj));
            throw new BusinessException("Informe 'CNPJ' válido");
        }

        if (!cnpj.equalsIgnoreCase("80331355000100")) {
            log.warn(format("[EnderecoService:findEnderecoByCnpj:31] - CNPJ, %s, não encontrado", cnpj));
            throw new NotFoundException(format("Registro não encontrado para %s", cnpj));
        }

        log.info(format("[EnderecoService:findEnderecoByCnpj:32] - Endereço localizado com sucesso para o CNPJ: %s", cnpj));

        return EnderecoDTO.builder()
                .cep("73050169")
                .endereco("Quadra Quadra 16 Conjunto I")
                .bairro("Sobradinho")
                .cidade("Brasília")
                .estado("Distrito Federal")
                .unidadeFederativa("DF")
                .build();
    }
}
