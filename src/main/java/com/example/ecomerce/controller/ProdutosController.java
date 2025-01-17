package com.example.ecomerce.controller;

import com.example.ecomerce.dto.ProdutoRequest;
import com.example.ecomerce.entity.Produtos;
import com.example.ecomerce.repository.ProdutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/produtos")
public class ProdutosController {

    @Autowired
    ProdutosRepository repository;

    @PostMapping("/save")
    public ResponseEntity<Produtos> save(@RequestBody ProdutoRequest itemDto){

        Produtos produtos = repository.save(new Produtos(itemDto));

        return ResponseEntity.status(201).body(produtos);
    }
}
