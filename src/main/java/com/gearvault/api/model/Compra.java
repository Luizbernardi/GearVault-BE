package com.gearvault.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode(callSuper = true)
public class Compra extends BaseClasse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


}
