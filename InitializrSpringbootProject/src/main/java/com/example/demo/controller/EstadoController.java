package com.example.demo.controller;

import com.example.demo.model.Estado;
import com.example.demo.service.EstadoService;
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
 * @author goulrte
 */
public class EstadoController {

    @Autowired
    private EstadoService estadoService;

    @GetMapping("/estados")
    public ResponseEntity<List<estado>> listaClientes() {
        return ResponseEntity.status(HttpStatus.OK).body(estadoService.listaEstados());
    }

    @GetMapping("estado/{codestado}")
    public ResponseEntity<Optional<Estado>> getByIdCliente(@PathVariable Integer codEstado) {
        return ResponseEntity.status(HttpStatus.OK).body(estadoService.getByIdCliente(codEstado));
    }

    @PostMapping("atualizar")
    public ResponseEntity<Estado> atualizaVeiculo(@RequestBody Estado estado) {
        return ResponseEntity.status(HttpStatus.OK).body(estadoService.atualizaestado(estado));
    }

    @DeleteMapping("estado/{codEstado}")
    public ResponseEntity<String> deleteByIdVeiculo(@PathVariable Integer codEstado) {
        estadoService.deleteByIdEstado(codEstado);
        return ResponseEntity.status(HttpStatus.OK).body("Estado removido com sucesso!");
    }
}
