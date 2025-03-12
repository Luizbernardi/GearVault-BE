package com.gearvault.api.dto;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class UsuarioDTO extends BaseDTO {

    private Long id;
    private String nome;
    private String email;
    private String perfil;
    private String telefone;

}