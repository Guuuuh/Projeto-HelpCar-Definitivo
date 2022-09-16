package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "tiposervico")
public class TipoServico {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codtiposervico")
    private Integer codTipoServico;
    
    @ManyToOne
    @JoinColumn(name = "codempresa")
    @JsonIgnore
    private Empresa empresa;
    
    @Column(name = "descricao")
    private String descricao;

    public TipoServico() {
    }

    public TipoServico(Integer codTipoServico, Empresa empresa, String descricao) {
        this.codTipoServico = codTipoServico;
        this.empresa = empresa;
        this.descricao = descricao;
    }    

    public Integer getCodTipoServico() {
        return codTipoServico;
    }

    public void setCodTipoServico(Integer codTipoServico) {
        this.codTipoServico = codTipoServico;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "TipoServico{" + "codTipoServico=" + codTipoServico + ", empresa=" + empresa + ", descricao=" + descricao + '}';
    }

}
