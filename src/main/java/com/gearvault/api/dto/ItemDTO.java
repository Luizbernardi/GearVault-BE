package com.gearvault.api.dto;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

@Data
@EqualsAndHashCode(callSuper = true)
public class ItemDTO extends BaseDTO {

    private Long id;
    private String codigo;
    private String descricao;
    private BigDecimal valor;
    private Integer quantidade;
    private LocalArmazenamentoDTO localArmazenamento;
    private String categoria;
    private LocalDate dataEntrada;
    private LocalDate dataSaida;
    private Set<ItemCompraDTO> compras;

}
