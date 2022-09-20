package com.example.demo.repository;

import com.example.demo.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository <Endereco, Integer> {
    
}
