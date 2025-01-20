package com.example.ecomerce.repository;

import com.example.ecomerce.entity.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProdutosRepository extends JpaRepository<Produtos, Long> {
}
