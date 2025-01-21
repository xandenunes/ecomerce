package com.example.ecomerce.service;

import com.example.ecomerce.dto.ProdutoRequest;
import com.example.ecomerce.entity.Produtos;
import com.example.ecomerce.mapper.ProdutosMapper;
import com.example.ecomerce.mapper.ProdutosUpdate;
import com.example.ecomerce.repository.ProdutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutosService {

    @Autowired
    ProdutosRepository produtosRepository;

    @Autowired
    ProdutosMapper produtosMapper;

    @Autowired
    ProdutosUpdate produtosUpdate;

    public Produtos save(ProdutoRequest itemDto){
        Produtos produtos = produtosMapper.requestToEntity(itemDto);
        return produtosRepository.save(produtos);
    }

    public List<Produtos> getAll(){
        return produtosRepository.findAll();
    }

    public Produtos update(Long id, ProdutoRequest resquest) throws Exception{
        Produtos entity = this.findById(id);
        produtosUpdate.updateProdutos(resquest, entity);
        return produtosRepository.save(entity);
    }

    public Produtos findById(Long id) throws Exception {
        return produtosRepository.findById(id).orElseThrow(ChangeSetPersister.NotFoundException::new);
    }

    public void deleteById(Long id) {
        produtosRepository.deleteById(id);
    }
}
