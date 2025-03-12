package com.gearvault.api.dto;
import com.gearvault.api.model.Compra;
import com.gearvault.api.model.Item;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.math.BigDecimal;

@Data
@EqualsAndHashCode(callSuper = true)
public class ItemCompraDTO extends BaseDTO {

    private Long id;
    private Item item;
    private Compra compra;
    private Integer quantidade;
    private BigDecimal precoUnitario;

}
