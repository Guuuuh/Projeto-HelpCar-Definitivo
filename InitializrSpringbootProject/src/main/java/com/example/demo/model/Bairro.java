package com.example.demo.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "bairro")
public class Bairro {

    @Id
    @Column(name = "codbairro")
    private Integer codBairro;
    
    @Column(name = "nome")
    private String nome;
    
    @ManyToOne
    @JoinColumn(name = "codcidade")
    private Cidade cidade;

    @ManyToOne
    @JoinColumn(name = "codendereco")
    private Endereco endereco;
    
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Bairro{" + "codBairro=" + codBairro + ", nome=" + nome + ", cidade=" + cidade + ", endereco=" + endereco + '}';
    }
    
    

}
