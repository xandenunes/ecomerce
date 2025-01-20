package com.example.ecomerce.mapper;

import com.example.ecomerce.dto.ProdutoRequest;
import com.example.ecomerce.entity.Produtos;
import org.mapstruct.*;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface ProdutosUpdate {

    void updateProdutos(ProdutoRequest request,@MappingTarget Produtos entity);
}
