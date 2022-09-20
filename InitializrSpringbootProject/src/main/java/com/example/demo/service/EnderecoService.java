package com.example.demo.service;

import com.example.demo.model.Endereco;
import java.util.List;
import java.util.Optional;

public interface EnderecoService {
    
    public Endereco salvaEndereco (Endereco endereco);
   
    public List<Endereco> listaEndereco ();
    
    public Optional<Endereco> getByIdEndereco(Integer Endereco);
    
    public Endereco atualizaEndereco (Endereco endereco);
    
    public void deleteByIdEndereco (Integer codEndereco);
}
