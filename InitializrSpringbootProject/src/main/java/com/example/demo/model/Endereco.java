package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


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

    @ManyToOne (cascade = CascadeType.ALL)
    @JoinColumn (name = "codempresa")
    private Empresa empresa;
    
    
    @ManyToOne (cascade = CascadeType.ALL)
    @JoinColumn(name = "codcliente")
    private Cliente cliente;
    
    @OneToMany
    @JoinColumn(name = "codendereco")
    @JsonIgnore
    private List<Bairro> bairros = new ArrayList<>();
    

    public Endereco() {
    }

    public Endereco(String cep, String rua, int numero, Bairro bairro, Empresa empresa) {
        this.cep = cep;
        this.rua = rua;
        this.numero = numero;
        this.empresa = empresa;
    }

    public List<Bairro> getBairros() {
        return bairros;
    }

    public void setBairros(List<Bairro> bairros) {
        this.bairros = bairros;
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

    public Empresa getEmpresa() {
        return empresa;
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


    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return "Endereco{" + "codEndereco=" + codEndereco + ", cep=" + cep + ", rua=" + rua + ", numero=" + numero + ", empresa=" + empresa + ", bairros=" + bairros + '}';
    }

    
    
    

}
