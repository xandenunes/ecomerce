package com.example.ecomerce.mapper;

import com.example.ecomerce.dto.ProdutoRequest;
import com.example.ecomerce.entity.Produtos;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.ERROR)
public interface ProdutosMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "categoria", ignore = true)
    Produtos requestToEntity(ProdutoRequest request);
}
