package com.gearvault.api.dto;
import com.gearvault.api.model.Fornecedor;
import com.gearvault.api.model.ItemCompra;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;

@Data
@EqualsAndHashCode(callSuper = true)
public class CompraDTO extends BaseDTO {

    private Long id;
    private LocalDate dataCompra;
    private Fornecedor fornecedor;
    private Set<ItemCompra> itens;
    private BigDecimal valorTotal;
    private String observacoes;

}
