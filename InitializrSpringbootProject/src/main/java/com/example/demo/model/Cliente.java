
package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
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
@Table (name = "cliente")
public class Cliente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codcliente")
    private Integer codCliente;
    
    @Column(name = "nome")
    private String nome;
    
    @Column(name = "cpf")
    private String cpf;
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "codcliente")
    private List<Endereco> enderecoCliente = new ArrayList<>();
    
    @OneToMany
    @JoinColumn(name = "codcliente")
    private List<Veiculo> veiculos = new ArrayList<>();

    public Cliente() {
    }

    public Cliente(Integer codCliente, String nome, String cpf) {
        this.codCliente = codCliente;
        this.nome = nome;
        this.cpf = cpf;
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

    public List<Endereco> getEnderecoCliente() {
        return enderecoCliente;
    }

    public void setEnderecoCliente(List<Endereco> enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    @Override
    public String toString() {
        return "Cliente{" + "codCliente=" + codCliente + ", nome=" + nome + ", cpf=" + cpf + ", enderecoCliente=" + enderecoCliente + ", veiculos=" + veiculos + '}';
    }
    
    
    
}
