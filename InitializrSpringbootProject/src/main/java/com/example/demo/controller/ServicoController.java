
package com.example.demo.controller;

import com.example.demo.model.Servico;
import com.example.demo.service.ServicoService;
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
public class ServicoController {
    
    @Autowired
    private ServicoService servicoService;
    
    @GetMapping("/servicos")
    public ResponseEntity<List<Servico>> listaServicos() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(servicoService.listaServicos());
    }
        @GetMapping("servico/{codservico}")
    public ResponseEntity<Optional<Servico>> getByIdServico(@PathVariable Integer codServico){
        return ResponseEntity.status(HttpStatus.OK).body(servicoService.getByIdServico(codServico));
    }

    @PostMapping("servico")
    public ResponseEntity<Servico> salvaServico(@RequestBody Servico servico){
        return ResponseEntity.status(HttpStatus.CREATED).body(servicoService.salvaServico(servico));
    }

    @PutMapping("servico")
    public ResponseEntity<Servico> atualizaServico(@RequestBody Servico servico){
        return ResponseEntity.status(HttpStatus.OK).body(servicoService.atualizaServico(servico));
    }
    
    @DeleteMapping("servico/{codservico}")
    public ResponseEntity<String> deleteByIdServico(@PathVariable Integer codServico){
        servicoService.deleteByIdServico(codServico);
        return ResponseEntity.status(HttpStatus.OK).body("Serviço removido com sucesso");
    }

}
