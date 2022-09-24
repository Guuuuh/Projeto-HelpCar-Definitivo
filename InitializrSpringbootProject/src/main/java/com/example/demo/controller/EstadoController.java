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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author goularte
 */
@RestController
@RequestMapping("/api")
public class EstadoController {

    @Autowired
    private EstadoService estadoService;

    @GetMapping("/estado")
    public ResponseEntity<List<Estado>> listaEstados() {
        return ResponseEntity.status(HttpStatus.OK).body(estadoService.listaEstados());
    }

    @GetMapping("estado/{codestado}")
    public ResponseEntity<Optional<Estado>> getByIdEstado(@PathVariable Integer codestado) {
        return ResponseEntity.status(HttpStatus.OK).body(estadoService.getByIdEstado(codestado));
    }

    @PostMapping("estado")
    public ResponseEntity<Estado> salvaEstado(@RequestBody Estado estado) {
        return ResponseEntity.status(HttpStatus.CREATED).body(EstadoService.salvaEstado(estado));
    }

    @PutMapping("estado")
    public ResponseEntity<Estado> atualizaEstado(@RequestBody Estado estado) {
        return ResponseEntity.status(HttpStatus.OK).body(estadoService.atualizaEstado(estado));
    }

    @DeleteMapping("estado/{codestado}")
    public ResponseEntity<String> deleteByIdEstado(@PathVariable Integer codestado) {
        estadoService.deleteByIdEstado(codestado);
        return ResponseEntity.status(HttpStatus.OK).body("Estado removida com sucesso");
    }
}
