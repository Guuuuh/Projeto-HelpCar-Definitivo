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
@Table (name = "servico")
public class Servico {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codservico")
    private Integer codServico;
    
    @ManyToOne
    @JoinColumn(name = "codempresa")
    @JsonIgnore
    private Empresa empresa;
    
    @ManyToOne
    @JoinColumn(name = "codtiposervico")
    @JsonIgnore
    private TipoServico tiposervico;
    
    @Column(name = "valor")
    private float valor;

    public Servico() {
    }

    public Servico(Integer codServico, Empresa empresa, TipoServico tiposervico, float valor) {
        this.codServico = codServico;
        this.empresa = empresa;
        this.tiposervico = tiposervico;
        this.valor = valor;
    }

    public Integer getCodServico() {
        return codServico;
    }

    public void setCodServico(Integer codServico) {
        this.codServico = codServico;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public TipoServico getTiposervico() {
        return tiposervico;
    }

    public void setTiposervico(TipoServico tiposervico) {
        this.tiposervico = tiposervico;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Servico{" + "codServico=" + codServico + ", empresa=" + empresa + ", tiposervico=" + tiposervico + ", valor=" + valor + '}';
    }    
    
}
