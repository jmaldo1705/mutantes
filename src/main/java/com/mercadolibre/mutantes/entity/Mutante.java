package com.mercadolibre.mutantes.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "mutantes")
public class Mutante {
    @Id
    private String dna;

    private boolean isMutant;
}
