package com.example.demo.service;

import com.example.demo.model.ContrataServico;
import java.util.List;
import java.util.Optional;

public interface ContrataServicoService {
    
    public ContrataServico salvaContrataServico(ContrataServico contrataServico);
    
    public List<ContrataServico> listaContrataServicos();
    
    public Optional<ContrataServico> getByIdContrataServico(Integer codContrataServico);
    
    public ContrataServico atualizaContrataServico(ContrataServico contrataServico);
    
    public void deleteByIdContrataServico (Integer codContrataServico);
    
}
