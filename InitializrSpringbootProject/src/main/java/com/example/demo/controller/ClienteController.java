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
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author gabrielvitoretti
 */
public class ClienteController {
    @Autowired
    private ClienteService clienteService;
    
    @GetMapping("/clientes")
    public ResponseEntity<List<Cliente>> listaClientes() {
        return ResponseEntity.status(HttpStatus.OK).body(clienteService.listaClientes());
    }
    
    @GetMapping("cliente/{codcliente}")
    public ResponseEntity<Optional<Cliente>> getByIdCliente(@PathVariable Integer codCliente){
        return ResponseEntity.status(HttpStatus.OK).body(clienteService.getByIdCliente(codCliente));
    }
    
    @PostMapping("atualizar")
    public ResponseEntity<Cliente> atualizaVeiculo(@RequestBody Cliente cliente){
        return ResponseEntity.status(HttpStatus.OK).body(clienteService.atualizaCliente(cliente));
    }
    
    @DeleteMapping("veiculo/{codVeiculo}")
    public ResponseEntity<String> deleteByIdVeiculo(@PathVariable Integer codCliente){
        clienteService.deleteByIdCliente(codCliente);
        return ResponseEntity.status(HttpStatus.OK).body("Veiculo removido com sucesso!");
    }
}
