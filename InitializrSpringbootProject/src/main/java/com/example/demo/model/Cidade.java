package com.example.demo.model;

public class Cidade {

    private Integer codCidade;
    private String nome;
    private Estado estado;

    public Cidade() {
    }

    public Cidade(Integer codCidade, String nome, Estado estado) {
        this.codCidade = codCidade;
        this.nome = nome;
        this.estado = estado;
    }

    public Integer getCodCidade() {
        return codCidade;
    }

    public String getNome() {
        return nome;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Cidade{" + "codCidade=" + codCidade + ", nome=" + nome + ", estado=" + estado + '}';
    }

}
