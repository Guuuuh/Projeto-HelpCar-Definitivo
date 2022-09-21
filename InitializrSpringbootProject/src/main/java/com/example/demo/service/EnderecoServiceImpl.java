package com.example.demo.service;

import com.example.demo.model.Endereco;
import com.example.demo.repository.EnderecoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;


public class  EnderecoServiceImpl implements EnderecoService {
    
    @Autowired
    private EnderecoRepository enderecoRepository;
    
    @Override
    public Endereco salvaEndereco (Endereco endereco){
        return enderecoRepository.save(endereco);
    }
    
    @Override
    public List<Endereco> listaEnderecos (){
        return enderecoRepository.findAll();
    }
    
    @Override
    public Optional<Endereco> getByIdEndereco (Integer Endereco){
        return enderecoRepository.findById(Endereco);
    }
    
    @Override
    public Endereco atualizaEndereco (Endereco endereco){
        return enderecoRepository.save(endereco);
    }
    
    @Override
    public void deleteByIdEndereco (Integer codEndereco){
        enderecoRepository.deleteById(codEndereco);
    }
}
