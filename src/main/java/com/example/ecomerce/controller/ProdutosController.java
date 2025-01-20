package com.example.ecomerce.controller;

import com.example.ecomerce.dto.ProdutoRequest;
import com.example.ecomerce.entity.Produtos;
import com.example.ecomerce.repository.ProdutosRepository;
import com.example.ecomerce.service.ProdutosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/produtos")
public class ProdutosController {

    @Autowired
    ProdutosService produtosService;

    @PostMapping("/save")
    public ResponseEntity<Produtos> save(@RequestBody ProdutoRequest itemDto){

        Produtos produtos = produtosService.save(itemDto);

        return ResponseEntity.status(201).body(produtos);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Produtos>> getAllProdutos(){

        List<Produtos> produtos=produtosService.getAll();

        return ResponseEntity.ok(produtos);
    }

    @GetMapping(value = "/get/{id}")
    public ResponseEntity getProduto(@PathVariable Long id) {
        var produtos = new Produtos();
        try{
            produtos = produtosService.findById(id);
        }catch (Exception e){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(produtos);
    }


    @PutMapping(value = "/update/{id}")
    public ResponseEntity updateProduto(@PathVariable Long id, @RequestBody ProdutoRequest itemDTO) {
        var produtos = new Produtos();
        try{
            produtos = produtosService.update(id,itemDTO);
        }catch (ChangeSetPersister.NotFoundException e){
            return ResponseEntity.notFound().build();
        }
        catch (Exception e){
            return ResponseEntity.badRequest().body(e);
        }
        return ResponseEntity.ok(produtos);
    }

    @DeleteMapping(path = "/delete/{id}")
    public ResponseEntity removeProduto(@PathVariable Long id) {
        try{
            produtosService.deleteById(id);
        }catch (Exception e){
            return ResponseEntity.badRequest().body(e);
        }
        return ResponseEntity.ok(true);
    }
}
