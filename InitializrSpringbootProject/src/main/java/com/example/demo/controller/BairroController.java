package com.example.demo.controller;

import com.example.demo.model.Bairro;
import com.example.demo.service.BairroService;
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
public class BairroController {

    @Autowired
    private BairroService bairroService;

    @GetMapping("/bairro")
    public ResponseEntity<List<Bairro>> listaBairros() {
        return ResponseEntity.status(HttpStatus.OK).body(bairroService.listaBairros());
    }

    @GetMapping("bairro/{codbairro}")
    public ResponseEntity<Optional<Bairro>> getByIdBairro(@PathVariable Integer codbairro) {
        return ResponseEntity.status(HttpStatus.OK).body(bairroService.getByIdBairro(codbairro));
    }

    @PostMapping("bairro")
    public ResponseEntity<Bairro> salvaBairro(@RequestBody Bairro bairro) {
        return ResponseEntity.status(HttpStatus.CREATED).body(bairroService.salvaBairro(bairro));
    }

    @PutMapping("bairro")
    public ResponseEntity<Bairro> atualizaBairro(@RequestBody Bairro bairro) {
        return ResponseEntity.status(HttpStatus.OK).body(bairroService.atualizaBairro(bairro));
    }

    @DeleteMapping("bairro/{codbairro}")
    public ResponseEntity<String> deleteByIdBairro(@PathVariable Integer codbairro) {
        bairroService.deleteByIdBairro(codbairro);
        return ResponseEntity.status(HttpStatus.OK).body("Bairro removido com sucesso");
    }
}
