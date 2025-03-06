package com.gearvault.api.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.Set;

@Data
@Entity
@EqualsAndHashCode(callSuper = true)
public class Fornecedor extends BaseClasse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false, length = 200)
    private String nome;

    @Column(name = "cnpj", unique = true, length = 18)
    private String cnpj;

    @Column(name = "email", length = 100)
    private String email;

    @Column(name = "telefone", length = 20)
    private String telefone;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco_id", referencedColumnName = "id")
    private Endereco endereco;

    @OneToMany(mappedBy = "fornecedor", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Compra> compras;

    @Column(name = "observacoes", columnDefinition = "TEXT")
    private String observacoes;
}