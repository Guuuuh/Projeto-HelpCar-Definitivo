package com.example.demo.model;

public class Bairro {

    private Integer codBairro;
    private String nome;
    private Cidade cidade;

    public Bairro() {
    }

    public Bairro(Integer codBairro, String nome, Cidade cidade) {
        this.codBairro = codBairro;
        this.nome = nome;
        this.cidade = cidade;
    }

    public Integer getCodBairro() {
        return codBairro;
    }

    public String getNome() {
        return nome;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCidae(Cidade cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Bairro{" + "codBairro=" + codBairro + ", nome=" + nome + ", cidade=" + cidade + '}';
    }

}
