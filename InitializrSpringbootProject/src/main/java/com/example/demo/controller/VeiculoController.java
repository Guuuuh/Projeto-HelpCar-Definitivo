package com.example.demo.controller;

import com.example.demo.model.Veiculo;
import com.example.demo.service.VeiculoService;
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
public class VeiculoController {
    @Autowired
    private VeiculoService veiculoService;
    
    @GetMapping("/veiculos")
    public ResponseEntity<List<Veiculo>> listaVeiculos() {
        return ResponseEntity.status(HttpStatus.OK).body(veiculoService.listaVeiculos());
    }
    
    @GetMapping("veiculo/{codVeiculo}")
    public ResponseEntity<Optional<Veiculo>> getByIdVeiculo(@PathVariable Integer codVeiculo){
        return ResponseEntity.status(HttpStatus.OK).body(veiculoService.getByIdVeiculo(codVeiculo));
    }
    
    @PutMapping("atualizar")
    public ResponseEntity<Veiculo> atualizaVeiculo(@RequestBody Veiculo veiculo){
        return ResponseEntity.status(HttpStatus.OK).body(veiculoService.atualizaVeiculo(veiculo));
    }
    
    @PostMapping("veiculo-criar")
    public ResponseEntity<Veiculo> salvaVeiculo(@RequestBody Veiculo veiculo){
        return ResponseEntity.status(HttpStatus.CREATED).body(veiculoService.salvaVeiculo(veiculo));
    }
    
    @DeleteMapping("veiculo/{codVeiculo}")
    public ResponseEntity<String> deleteByIdVeiculo(@PathVariable Integer codVeiculo){
        veiculoService.deleteByIdVeiculo(codVeiculo);
        return ResponseEntity.status(HttpStatus.OK).body("Veiculo removido com sucesso!");
    }
    
}
