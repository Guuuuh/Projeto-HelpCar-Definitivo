
package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author gabrielvitoretti
 */

@Entity
@Table(name = "veiculo")
public class Veiculo implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codveiculo")
    private Integer codVeiculo;
    
    @ManyToOne
    @JoinColumn(name = "codcliente")
    @JsonIgnore
    private Cliente cliente;
    
    @Column(name = "marca")
    private String marca; 
    
    @Column(name = "modelo")
    private String modelo;
    
    @Column(name = "ano")
    private String ano;
    
    @Column(name = "placa")
    private String placa;

    public Veiculo() {
    }

    public Veiculo(Integer codVeiculo, Cliente cliente, String marca, String modelo, String ano, String placa) {
        this.codVeiculo = codVeiculo;
        this.cliente = cliente;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
    }

    public Integer getCodVeiculo() {
        return codVeiculo;
    }

    public void setCodVeiculo(Integer codVeiculo) {
        this.codVeiculo = codVeiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Veiculo{" + "codVeiculo=" + codVeiculo + ", cliente=" + cliente + ", marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ", placa=" + placa + '}';
    }
    
    
    
    
    
}
