package com.example.demo.service;

import com.example.demo.model.ContrataServico;
import com.example.demo.repository.ContrataServicoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

public class ContrataServicoServiceImpl implements ContrataServicoService {
    
    @Autowired
    private ContrataServicoRepository contrataServicoRepository;
    
    @Override
    public ContrataServico salvaContrataServico(ContrataServico contrataServico) {
        return contrataServicoRepository.save(contrataServico);
    }
    
    @Override
    public List<ContrataServico> listaContrataServicos() {
        return contrataServicoRepository.findAll();
    }
    
    @Override
    public Optional<ContrataServico> getByIdContrataServico(Integer codContrataServico) {
        return contrataServicoRepository.findById(codContrataServico);
    }

    @Override
    public ContrataServico atualizaContrataServico(ContrataServico contrataServico) {
        return contrataServicoRepository.save(contrataServico);
    }

    @Override
    public void deleteByIdContrataServico(Integer codContrataServico) {
        contrataServicoRepository.deleteById(codContrataServico);
    }
    
}
