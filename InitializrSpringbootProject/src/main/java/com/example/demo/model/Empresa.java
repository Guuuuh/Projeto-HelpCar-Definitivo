package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "empresa")
public class Empresa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "codempresa")
	private int codEmpresa;
	
	@Column(name = "nomefantasia")
	private String nomeFantasia;
	
	@Column(name = "cnpj")
	private String cnpj;
	
	@Column(name = "contatoempresa")
	private String contatoEmpresa;
	
	//mandei email pro professor
	private List<Endereco> enderecosEmpresas = new ArrayList<>();
	
	public Empresa () {
		
	}
	
	public Empresa (int codEmpresa, String nomeFantasia, String cnpj, String contatoEmpresa) {
		this.codEmpresa = codEmpresa;
		this.nomeFantasia = nomeFantasia;
		this.cnpj = cnpj;
		this.contatoEmpresa = contatoEmpresa;
	}
	
	//getters
	public int getCodEmpresa() {
		return codEmpresa;
	}
	
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	
	public String getCnpj() {
		return contatoEmpresa;
	}
	
	public List<Endereco> getEnderecoEmpresa () {
		return enderecosEmpresas;
	}
	
	//setters
	public void setNomeFantasia (String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	
	public void setCnpj (String cnpj) {
		this.cnpj = cnpj;
	}
	
	public void setContatoEmpresa (String contatoEmpresa) {
		this.contatoEmpresa = contatoEmpresa;
	}
	
	//addEndereco
	public void addEndereco (Endereco Endereco) {
		this.enderecosEmpresas.add(Endereco);
	}
	
	//removerEndereco
	public void removeEdereco (Endereco Endereco) {
		this.enderecosEmpresas.remove(Endereco);
	}
	
	//toString
	@Override
	public String toString() {
		return "Empresa ={" + "codEmpresa = " + codEmpresa + " nomeFantasia = " + nomeFantasia + " cnpj = " + cnpj + " contatoEmpresa = " + contatoEmpresa;
	}
	
}
