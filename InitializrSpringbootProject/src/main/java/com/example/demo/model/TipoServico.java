package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "tipoServico")
public class TipoServico {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codtiposervico")
    private Integer codTipoServico;
    
    @Column(name = "codempresa")
    private Integer codEmpresa;
    
    @Column(name = "descricao")
    private String descricao;

    public TipoServico() {
    }

    public TipoServico(Integer codTipoServico, Integer codEmpresa, String descricao) {
        this.codTipoServico = codTipoServico;
        this.codEmpresa = codEmpresa;
        this.descricao = descricao;
    }    

    public Integer getCodTipoServico() {
        return codTipoServico;
    }

    public Integer getCodEmpresa() {
        return codEmpresa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "TipoServico{" + "codTipoServico=" + codTipoServico + ", codEmpresa=" + codEmpresa + ", descricao=" + descricao + '}';
    }  
}
