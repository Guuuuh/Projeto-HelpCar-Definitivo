package com.example.demo.controller;

import com.example.demo.model.Veiculo;
import com.example.demo.service.VeiculoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Tag;
import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.Tags;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
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
@Api(value = "/veiculo", tags = "Controller Veículos", description = "Controller dos veículos")
public class VeiculoController {
    
    @Autowired
    private VeiculoService veiculoService;
    
    @GetMapping("/veiculos")
    public ResponseEntity<List<Veiculo>> listaVeiculos() {
        return ResponseEntity.status(HttpStatus.OK).body(veiculoService.listaVeiculos());
    }
    
    @GetMapping("veiculo/{codVeiculo}")
    @ApiOperation("Obter detalhes de um cliente")
    @ApiResponses({
        @ApiResponse(code = 200, message = "Cliente encontrado"),
        @ApiResponse(code = 404, message = "Cliente não encontrado")
    })
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
