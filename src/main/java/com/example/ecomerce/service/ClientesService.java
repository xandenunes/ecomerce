package com.example.ecomerce.service;

import com.example.ecomerce.dto.ClientesRequest;
import com.example.ecomerce.entity.Clientes;
import com.example.ecomerce.mapper.ClientesMapper;
import com.example.ecomerce.mapper.ClientesUpdate;
import com.example.ecomerce.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientesService {

    @Autowired
    ClientesMapper clientesMapper;

    @Autowired
    ClientesRepository clientesRepository;

    @Autowired
    ClientesUpdate clientesUpdate;

    public List<Clientes> getAllClientes(){

        return clientesRepository.findAll();
    }

    public Clientes findById(Long id) throws Exception{
        return clientesRepository.findAllById(id);
    }

    public Clientes save(Clientes clientes) throws Exception{
        return clientesRepository.save(clientes);
    }

    public void deleteById(Long id) throws Exception{
        clientesRepository.deleteById(id);
    }

    public Clientes updateCliente(Long id, Clientes newCliente) throws Exception{
        Clientes cliente  = clientesRepository.findAllById(id);

        clientesUpdate.updateClientes(cliente, newCliente);

        return clientesRepository.save(cliente);
    }

}
