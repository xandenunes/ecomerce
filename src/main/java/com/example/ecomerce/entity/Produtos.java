package com.example.ecomerce.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "PRODUTOS")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Produtos {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;

    @Column
    private String nome;

    @Column
    private double preco;

    @Column
    private String marca;

    @Column
    private String categoria;
}
