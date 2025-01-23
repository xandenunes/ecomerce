package com.example.ecomerce.mapper;


import com.example.ecomerce.entity.Clientes;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface ClientesUpdate {

    void updateClientes(Clientes cliente, @MappingTarget Clientes newCliente);
}