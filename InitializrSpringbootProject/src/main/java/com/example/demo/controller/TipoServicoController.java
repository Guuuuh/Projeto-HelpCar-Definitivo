package com.example.demo.controller;

import com.example.demo.model.TipoServico;
import com.example.demo.service.TipoServicoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TipoServicoController {
    
    @Autowired
    private TipoServicoService tipoServicoService;
    
    @GetMapping("/tiposervicos")
    public ResponseEntity<List<TipoServico>> listaTipoServicos() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(tipoServicoService.listaTipoServicos());
    }
    
}
