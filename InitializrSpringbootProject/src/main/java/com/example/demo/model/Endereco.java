package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name = "endereco")
public class Endereco {
    private Integer codEndereco;
    private String cep;
    private String rua;
    private int numero;
    private Bairro bairro;
    private Empresa empresa;
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
