package com.example.ecomerce.dto;

public record ClientesRequest(String nome,
                              String email,
                              String cpf,
                              String data_nascimento) {
}
