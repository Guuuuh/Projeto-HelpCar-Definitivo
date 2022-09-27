package com.example.demo.controller;

import com.example.demo.model.Cliente;
import com.example.demo.service.ClienteService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author gabrielvitoretti
 */
@RestController
@RequestMapping("/api")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;
    
    @GetMapping("/clientes")
    public ResponseEntity<List<Cliente>> listaClientes() {
        return ResponseEntity.status(HttpStatus.OK).body(clienteService.listaClientes());
    }
    
    @GetMapping("cliente/{codCliente}")
    public ResponseEntity<Optional<Cliente>> getByIdCliente(@PathVariable Integer codCliente){
        return ResponseEntity.status(HttpStatus.OK).body(clienteService.getByIdCliente(codCliente));
    }
    
    @PutMapping("atualizarcliente")
    public ResponseEntity<Cliente> atualizaCliente(@RequestBody Cliente cliente){
        return ResponseEntity.status(HttpStatus.OK).body(clienteService.atualizaCliente(cliente));
    }
    
    @PostMapping("criarclientes")
    public ResponseEntity<Cliente> salvaCliente(@RequestBody Cliente cliente){
        return ResponseEntity.status(HttpStatus.CREATED).body(clienteService.salvaCliente(cliente));
    }
    
    @DeleteMapping("remove/{codCliente}")
    public ResponseEntity<String> deleteByIdCliente(@PathVariable Integer codCliente){
        clienteService.deleteByIdCliente(codCliente);
        return ResponseEntity.status(HttpStatus.OK).body("Cliente removido com sucesso!");
    }
}
