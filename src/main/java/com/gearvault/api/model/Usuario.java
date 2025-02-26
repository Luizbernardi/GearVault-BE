package com.gearvault.api.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

@Data
@Entity
@EqualsAndHashCode(callSuper = true)
public class Usuario extends BaseClasse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false, unique = true)
    private String email;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Status status;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Perfil perfil;

    @Column(length = 20)
    private String telefone;

    @Column(length = 255)
    private String fotoPerfil;

    @Column(name = "ultimo_login_at")
    private LocalDateTime ultimoLoginAt;

    @Column(nullable = false)
    private Integer tentativasLogin = 0;

    @Column(length = 500)
    private String authToken;

}
