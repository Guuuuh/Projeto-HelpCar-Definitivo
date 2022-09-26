package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "cidade")
public class Cidade {

    @Id
    @Column(name = "codcidade")
    private Integer codCidade;

    @Column(name = "nome")
    private String nome;

    @ManyToOne
    @JoinColumn(name = "codestado")
    @JsonIgnore
    private Estado estado;
    
    @OneToMany
    @JoinColumn(name = "codcidade")
    @JsonIgnore
    private List<Bairro> bairros = new ArrayList<>();

    public Cidade() {
    }

    public Cidade(Integer codCidade, String nome, Estado estado) {
        this.codCidade = codCidade;
        this.nome = nome;
        this.estado = estado;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public List<Bairro> getBairros() {
        return bairros;
    }

    public void setBairros(List<Bairro> bairros) {
        this.bairros = bairros;
    }

    public Integer getCodCidade() {
        return codCidade;
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cidade{" + "codCidade=" + codCidade + ", nome=" + nome + ", estados=" + '}';
    }

}
