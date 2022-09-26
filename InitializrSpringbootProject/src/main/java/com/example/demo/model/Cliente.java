
package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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

/**
 *
 * @author gabrielvitoretti
 */
@Entity
@Table(name = "cliente")
public class Cliente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codcliente")
    private Integer codCliente;
    
    @Column(name = "nome")
    private String nome;
    
    @Column(name = "cpf")
    private String cpf;
    
    @OneToMany
    @JoinColumn(name = "codcliente")
    @JsonIgnore
    private List<Endereco> enderecosClientes = new ArrayList<>();
    
    @OneToMany
    @JoinColumn(name = "codcliente")
    @JsonIgnore
    private List<Veiculo> listaVeiculos = new ArrayList<>();
    

    public Cliente() {
    }

    public Cliente(Integer codCliente, String nome, String cpf) {
        this.codCliente = codCliente;
        this.nome = nome;
        this.cpf = cpf;
    }

    public List<Veiculo> getListaVeiculos() {
        return listaVeiculos;
    }

    public void setListaVeiculos(List<Veiculo> listaVeiculos) {
        this.listaVeiculos = listaVeiculos;
    }

    

    public List<Endereco> getEnderecosClientes() {
        return enderecosClientes;
    }

    public void setEnderecosClientes(List<Endereco> enderecosClientes) {
        this.enderecosClientes = enderecosClientes;
    }
    

    public Integer getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(Integer codCliente) {
        this.codCliente = codCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Cliente{" + "codCliente=" + codCliente + ", nome=" + nome + ", cpf=" + cpf + ", enderecosClientes=" + enderecosClientes + ", listaVeiculos=" + listaVeiculos + '}';
    }


    

    
    
    
    
}
