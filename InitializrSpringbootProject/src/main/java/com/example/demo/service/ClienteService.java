
package com.example.demo.service;

import com.example.demo.model.Cliente;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author gabrielvitoretti
 */
public interface ClienteService {
    public List<Cliente> listaClientes();
    
    public Optional<Cliente> getByIdCliente(Integer codCliente);
    
    public Cliente atualizaCliente(Cliente cliente);
    
    public void deleteByIdCliente(Integer codCliente);
}
