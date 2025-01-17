package com.example.ecomerce.entity;

import com.example.ecomerce.dto.ProdutoRequest;
import jakarta.persistence.*;
import lombok.*;


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

    public Produtos(ProdutoRequest produtoRequest){
        this.nome = produtoRequest.nome();
        this.preco = produtoRequest.preco();
        this.marca = produtoRequest.marca();
    }
}
