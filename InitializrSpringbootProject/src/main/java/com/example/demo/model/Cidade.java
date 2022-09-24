package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
    private List<Estado> estados = new ArrayList<>();

    public Cidade() {
    }

    public Cidade(Integer codCidade, String nome, Estado estado) {
        this.codCidade = codCidade;
        this.nome = nome;
    }

    public Integer getCodCidade() {
        return codCidade;
    }

    public String getNome() {
        return nome;
    }

    public List<Estado> getEstados() {
        return estados;
    }

    public void setEstados(List<Estado> estados) {
        this.estados = estados;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cidade{" + "codCidade=" + codCidade + ", nome=" + nome + ", estados=" + estados + '}';
    }

}
