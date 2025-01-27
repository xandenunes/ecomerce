package com.example.ecomerce.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Entity
@Table(name = "CLIENTES")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Clientes {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    private String nome;

    private String email;

    private String telefone;

    private String senha;

    private String cpf;

    private String endereco;

    private String data_nascimento;

    @Column(name = "`timestamp`")
    @CreationTimestamp
    private Date created_at;

}
