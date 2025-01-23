package com.example.ecomerce.repository;


import com.example.ecomerce.entity.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientesRepository extends JpaRepository<Clientes, Long> {

    Clientes findAllById(Long id);
}
