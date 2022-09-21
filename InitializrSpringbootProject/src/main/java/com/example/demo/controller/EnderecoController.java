package com.example.demo.controller;

import com.example.demo.model.Endereco;
import com.example.demo.service.EnderecoService;
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

@RestController
@RequestMapping("/api")
public class EnderecoController {
    @Autowired
    private EnderecoService enderecoService;
    
    @GetMapping("/endereco")
    public ResponseEntity<List<Endereco>> listaEnderecos(){
        return ResponseEntity.status(HttpStatus.OK).body(enderecoService.listaEnderecos());
    }
    
    @GetMapping("endereco/{codendereco}")
    public ResponseEntity<Optional<Endereco>> getByIdEndereco(@PathVariable Integer codendereco){
        return ResponseEntity.status(HttpStatus.OK).body(enderecoService.getByIdEndereco(codendereco));
    }

    @PostMapping("endereco")
    public ResponseEntity<Endereco> salvaEndereco(@RequestBody Endereco endereco){
        return ResponseEntity.status(HttpStatus.CREATED).body(enderecoService.salvaEndereco(endereco));
    }

    @PutMapping("endereco")
    public ResponseEntity<Endereco> atualizaEmpresa(@RequestBody Endereco endereco){
        return ResponseEntity.status(HttpStatus.OK).body(enderecoService.atualizaEndereco(endereco));
    }
    
    @DeleteMapping("endereco/{codendereco}")
    public ResponseEntity<String> deleteByIdEndereco(@PathVariable Integer codendereco){
        enderecoService.deleteByIdEndereco(codendereco);
        return ResponseEntity.status(HttpStatus.OK).body("Endereco removido com sucesso");
    }   
    
}
