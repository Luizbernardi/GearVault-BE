package com.gearvault.api.dto;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(callSuper = true)
public class LocalArmazenamentoDTO extends BaseDTO {

    private Long id;
    private String rua;
    private String cidade;
    private String estado;
    private String cep;

}
