package com.gearvault.api.dto;
import com.gearvault.api.model.Fornecedor;
import com.gearvault.api.model.LocalArmazenamento;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.Set;

@Data
@EqualsAndHashCode(callSuper = true)
public class EnderecoDTO extends BaseDTO {

    private Long id;
    private String cep;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String pais;
    private Set<LocalArmazenamento> locaisArmazenamento;
    private Fornecedor fornecedor;

}
