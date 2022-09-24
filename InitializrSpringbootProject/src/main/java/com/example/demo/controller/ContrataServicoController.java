package com.example.demo.controller;

import com.example.demo.model.ContrataServico;
import com.example.demo.service.ContrataServicoService;
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
public class ContrataServicoController {
    
    @Autowired
    private ContrataServicoService contrataServicoService;
    
    @GetMapping("/contrataservicos")
    public ResponseEntity<List<ContrataServico>> listaContrataServicos() {
        return ResponseEntity.status(HttpStatus.OK).body(contrataServicoService.listaContrataServicos());
    }
    
    @GetMapping("contrataservico/{codcontrataservico}")
    public ResponseEntity<Optional<ContrataServico>> getByIdContrataServico(@PathVariable Integer codContrataServico){
        return ResponseEntity.status(HttpStatus.OK).body(contrataServicoService.getByIdContrataServico(codContrataServico));
    }

    @PostMapping("contrataservico")
    public ResponseEntity<ContrataServico> salvaContrataServico(@RequestBody ContrataServico contrataServico){
        return ResponseEntity.status(HttpStatus.CREATED).body(contrataServicoService.salvaContrataServico(contrataServico));
    }

    @PutMapping("contrataservico")
    public ResponseEntity<ContrataServico> atualizaContrataServico(@RequestBody ContrataServico contrataServico){
        return ResponseEntity.status(HttpStatus.OK).body(contrataServicoService.atualizaContrataServico(contrataServico));
    }
    
    @DeleteMapping("contrataservico/{codcontrataservico}")
    public ResponseEntity<String> deleteByIdContrataServico(@PathVariable Integer codContrataServico){
        contrataServicoService.deleteByIdContrataServico(codContrataServico);
        return ResponseEntity.status(HttpStatus.OK).body("Contrata Serviço removido com sucesso");
    }
    
}
