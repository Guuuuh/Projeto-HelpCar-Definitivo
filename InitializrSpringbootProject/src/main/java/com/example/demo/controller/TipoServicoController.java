package com.example.demo.controller;

import com.example.demo.model.TipoServico;
import com.example.demo.service.TipoServicoService;
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
public class TipoServicoController {
    
    @Autowired
    private TipoServicoService tipoServicoService;
    
    @GetMapping("/tiposervicos")
    public ResponseEntity<List<TipoServico>> listaTipoServicos() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(tipoServicoService.listaTipoServicos());
    }
    
    @GetMapping("tiposervico/{codtiposervico}")
    public ResponseEntity<Optional<TipoServico>> getByIdTipoServico(@PathVariable Integer codTipoServico){
        return ResponseEntity.status(HttpStatus.OK).body(tipoServicoService.getByIdTipoServico(codTipoServico));
    }

    @PostMapping("tiposervico")
    public ResponseEntity<TipoServico> salvaTipoServico(@RequestBody TipoServico tipoServico){
        return ResponseEntity.status(HttpStatus.CREATED).body(tipoServicoService.salvaTipoServico(tipoServico));
    }

    @PutMapping("tiposervico")
    public ResponseEntity<TipoServico> atualizaTipoServico(@RequestBody TipoServico tipoServico){
        return ResponseEntity.status(HttpStatus.OK).body(tipoServicoService.atualizaTipoServico(tipoServico));
    }
    
    @DeleteMapping("tiposervico/{codtiposervico}")
    public ResponseEntity<String> deleteByIdTipoServico(@PathVariable Integer codTipoServico){
        tipoServicoService.deleteByIdTipoServico(codTipoServico);
        return ResponseEntity.status(HttpStatus.OK).body("Tipo Serviço removido com sucesso");
    }    
}
