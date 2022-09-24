package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;

@Entity
@Table (name = "endereco")
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "codendereco")
    private Integer codEndereco;

    @Column(name = "cep")
    private String cep;

    @Column (name = "rua")
    private String rua;

    @Column (name = "numero")
    private int numero;

    @Column (name = "bairro")
    private Bairro bairro;

    @ManyToOne (cascade = CascadeType.ALL)
    @JoinColumn (name = "codempresa")
    @JsonIgnore
    private Empresa empresa;

    @ManyToOne (cascade = CascadeType.ALL)
    @JoinColumn (name = "codcliente")
    @JsonIgnore
    private Cliente cliente;

    public Endereco() {
    }

    public Endereco(Integer codEndereco, String cep, String rua, int numero, Bairro bairro, Empresa empresa, Cliente cliente) {
        this.codEndereco = codEndereco;
        this.cep = cep;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.empresa = empresa;
        this.cliente = cliente;
    }

    
    //getters
    public Integer getCodEndereco() {
        return codEndereco;
    }

    public String getCep() {
        return cep;
    }

    public String getRua() {
        return rua;
    }

    public int getNumero() {
        return numero;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public Cliente getCliente() {
        return cliente;
    }
    
    
    
    //setters
    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Endereco{" + "codEndereco=" + codEndereco + ", cep=" + cep + ", rua=" + rua + ", numero=" + numero + ", bairro=" + bairro + ", empresa=" + empresa + ", cliente=" + cliente + '}';
    }
    
    
    
    
    

}
