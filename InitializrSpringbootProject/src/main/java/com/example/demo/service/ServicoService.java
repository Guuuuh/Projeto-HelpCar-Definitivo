package com.example.demo.service;

import java.util.List;
import com.example.demo.model.Servico;
import java.util.Optional;

public interface ServicoService {
    
    public List<Servico> listaServicos();
    
    public Servico salvaServico(Servico servico);
    
    public Optional<Servico> getByIdServico(Integer codServico);
    
    public Servico atualizaServico(Servico servico);
    
    public void deleteByIdServico(Integer codServico);
    
}
