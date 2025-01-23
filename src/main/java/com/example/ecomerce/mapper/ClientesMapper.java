package com.example.ecomerce.mapper;


import com.example.ecomerce.dto.ClientesRequest;
import com.example.ecomerce.entity.Clientes;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import java.lang.annotation.Target;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.ERROR)
public interface ClientesMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "telefone", ignore = true)
    @Mapping(target = "endereco", ignore = true)
    @Mapping(target = "senha", ignore = true)
    @Mapping(target = "created_at", ignore = true)
    Clientes requestToEntity(ClientesRequest request);
}
