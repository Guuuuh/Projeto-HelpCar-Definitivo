
package com.example.demo.controller;

import com.example.demo.model.Servico;
import com.example.demo.service.ServicoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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
    
    
}
