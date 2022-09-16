package com.example.demo.model;

public class Estado {

    private Integer codEstado;
    private String nome;
    private String uf;
    private String pais;

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

    @Override
    public String toString() {
        return "Estado{" + "codEstado=" + codEstado + ", nome=" + nome + ", uf=" + uf + ", pais=" + pais + '}';
    }

}
