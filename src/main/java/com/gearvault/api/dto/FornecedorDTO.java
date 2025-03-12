package com.gearvault.api.dto;
import com.gearvault.api.model.Compra;
import com.gearvault.api.model.Endereco;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.Set;

@Data
@EqualsAndHashCode(callSuper = true)
public class FornecedorDTO extends BaseDTO {

    private Long id;
    private String nome;
    private String cnpj;
    private String email;
    private String telefone;
    private Endereco endereco;
    private Set<Compra> compras;
    private String observacoes;

}
