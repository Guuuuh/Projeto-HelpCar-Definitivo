package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name = "cliente_servico")
public class ContrataServico {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codcliente_servico")
    private Integer codContrataServico;
    
    @ManyToOne
    @JoinColumn (name = "codempresa")
    @JsonIgnore
    private Empresa empresa;
    
    @OneToOne
    @JoinColumn (name = "codcliente")
    @JsonIgnore
    private Cliente cliente;
    
    @OneToOne
    @JoinColumn (name = "codservico")
    @JsonIgnore
    private Servico servico;
    
    @ManyToOne
    @JoinColumn (name = "codveiculo")
    @JsonIgnore
    private Veiculo veiculo;

    public ContrataServico() {
    }

    public ContrataServico(Integer codContrataServico, Empresa empresa, Cliente cliente, Servico servico, Veiculo veiculo) {
        this.codContrataServico = codContrataServico;
        this.empresa = empresa;
        this.cliente = cliente;
        this.servico = servico;
        this.veiculo = veiculo;
    }

    public void setCodContrataServico(Integer codContrataServico) {
        this.codContrataServico = codContrataServico;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Integer getCodContrataServico() {
        return codContrataServico;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Servico getServico() {
        return servico;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    @Override
    public String toString() {
        return "ContrataServico{" + "codContrataServico=" + codContrataServico + ", empresa=" + empresa + ", cliente=" + cliente + ", servico=" + servico + ", veiculo=" + veiculo + '}';
    }   
    
}
