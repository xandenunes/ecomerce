package com.example.ecomerce.mapper;

import com.example.ecomerce.dto.ProdutoRequest;
import com.example.ecomerce.entity.Produtos;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING,
        unmappedTargetPolicy = ReportingPolicy.ERROR)
public interface ProdutosMapper {

    Produtos requestToEntity(ProdutoRequest request);
}
