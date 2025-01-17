package com.example.ecomerce.service;

import com.example.ecomerce.repository.ProdutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutosService {

    @Autowired
    ProdutosRepository repository;


}
