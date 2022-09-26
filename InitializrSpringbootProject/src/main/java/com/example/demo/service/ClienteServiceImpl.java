package com.example.demo.service;

import com.example.demo.model.Cliente;
import com.example.demo.repository.ClienteRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author gabrielvitoretti
 */
@Service
public class ClienteServiceImpl implements ClienteService{
    
    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public List<Cliente> listaClientes() {
        return clienteRepository.findAll();
    }
    
    @Override
    public Optional<Cliente> getByIdCliente(Integer codCliente) {
        return clienteRepository.findById(codCliente);
    }
    
    @Override
    public Cliente atualizaCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }
    
    @Override
    public void deleteByIdCliente(Integer codCliente){
        clienteRepository.deleteById(codCliente);
    }   
}
