package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "servico")
public class Servico {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codservico")
    private Integer codServico;
    
    @Column(name = "codempresa")
    private Integer codEmpresa;
    
    @Column(name = "codtiposervico")
    private TipoServico tiposervico;
    
    @Column(name = "valor")
    private float valor;
    
    
    
}
