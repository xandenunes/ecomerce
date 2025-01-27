package com.example.ecomerce.controller;

import com.example.ecomerce.dto.ClientesRequest;
import com.example.ecomerce.entity.Clientes;
import com.example.ecomerce.mapper.ClientesMapper;
import com.example.ecomerce.service.ClientesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/clientes")
public class ClientesController {

    @Autowired
    ClientesMapper clientesMapper;

    @Autowired
    ClientesService clientesService;


    @PostMapping("/save")
    public ResponseEntity<Clientes> save(@RequestBody ClientesRequest clientesRequest) throws Exception {

        Clientes newCliente = clientesMapper.requestToEntity(clientesRequest);

        return ResponseEntity.ok(clientesService.save(newCliente));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Clientes>> getAll() {

        List<Clientes> clientesList = clientesService.getAllClientes();

        return ResponseEntity.ok(clientesList);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Clientes> getById(@PathVariable Long id) throws Exception {

        Clientes cliente = new Clientes();
        try{
            cliente = clientesService.findById(id);
        } catch (Exception e){
            return ResponseEntity.notFound().build();
        }
            return ResponseEntity.ok(cliente);
    }

    @PutMapping("/put")
    public ResponseEntity<Clientes> updateCliente(@RequestBody ClientesRequest clienteRequest) throws Exception {

        Clientes cliente = clientesMapper.requestToEntity(clienteRequest);
        Clientes newCliente = new Clientes();

        try{clientesService.findById(cliente.getId());
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }

        newCliente = clientesService.updateCliente(cliente.getId(), newCliente);
        return ResponseEntity.ok(newCliente);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Clientes> delete(@PathVariable Long id) throws Exception {

        Clientes clienteToDelete = new Clientes();

        try{clienteToDelete = clientesService.findById(id);
        }catch (Exception e){
            return ResponseEntity.notFound().build();
        }
        clientesService.deleteById(id);

        return ResponseEntity.ok(clienteToDelete);
    }
}
