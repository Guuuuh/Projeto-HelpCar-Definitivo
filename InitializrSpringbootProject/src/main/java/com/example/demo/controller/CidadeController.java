package com.example.demo.controller;

import com.example.demo.model.Cidade;
import com.example.demo.service.CidadeService;
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
public class CidadeController {

    @Autowired
    private CidadeService cidadeService;

    @GetMapping("/cidade")
    public ResponseEntity<List<Cidade>> listaCidades() {
        return ResponseEntity.status(HttpStatus.OK).body(cidadeService.listaCidades());
    }

    @GetMapping("cidade/{codcidade}")
    public ResponseEntity<Optional<Cidade>> getByIdCidade(@PathVariable Integer codcidade) {
        return ResponseEntity.status(HttpStatus.OK).body(cidadeService.getByIdCidade(codcidade));
    }

    @PostMapping("cidade")
    public ResponseEntity<Cidade> salvaCidade(@RequestBody Cidade cidade) {
        return ResponseEntity.status(HttpStatus.CREATED).body(cidadeService.salvaCidade(cidade));
    }

    @PutMapping("cidade")
    public ResponseEntity<Cidade> atualizaCidade(@RequestBody Cidade cidade) {
        return ResponseEntity.status(HttpStatus.OK).body(cidadeService.atualizaCidade(cidade));
    }

    @DeleteMapping("cidade/{codcidade}")
    public ResponseEntity<String> deleteByIdCidade(@PathVariable Integer codcidade) {
        cidadeService.deleteByIdCidade(codcidade);
        return ResponseEntity.status(HttpStatus.OK).body("Cidade removida com sucesso");
    }
}
