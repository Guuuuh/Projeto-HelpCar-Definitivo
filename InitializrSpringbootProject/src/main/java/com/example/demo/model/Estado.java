package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "estado")
public class Estado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codestado")
    private Integer codEstado;

    @Column(name = "nome")
    private String nome;

    @Column(name = "uf")
    private String uf;

    @Column(name = "pais")
    private String pais;
    
    @OneToMany
    @JoinColumn(name = "codestado")
    private List<Cidade> cidades = new ArrayList<>();

    public Estado() {
    }
    
    
    public Estado(Integer codEstado, String nome, String uf, String pais) {
        this.codEstado = codEstado;
        this.nome = nome;
        this.uf = uf;
        this.pais = pais;
    }

    public Integer getCodEstado() {
        return codEstado;
    }

    public String getNome() {
        return nome;
    }

    public String getUf() {
        return uf;
    }

    public String getPais() {
        return pais;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public List<Cidade> getCidades() {
        return cidades;
    }

    public void setCidades(List<Cidade> cidades) {
        this.cidades = cidades;
    }

    @Override
    public String toString() {
        return "Estado{" + "codEstado=" + codEstado + ", nome=" + nome + ", uf=" + uf + ", pais=" + pais + ", cidades=" + cidades + '}';
    }

}
