package com.gearvault.api.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Fornecedor extends BaseClass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
