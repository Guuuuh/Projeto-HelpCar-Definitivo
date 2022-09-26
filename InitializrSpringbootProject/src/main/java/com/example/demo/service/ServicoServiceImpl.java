package com.example.demo.service;

import com.example.demo.model.Servico;
import com.example.demo.repository.ServicoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicoServiceImpl implements ServicoService {
    
    @Autowired
    private ServicoRepository servicoRepository;
    
    @Override
    public List<Servico> listaServicos() {
        return servicoRepository.findAll();
    }
    
    @Override
    public Servico salvaServico(Servico servico) {
        return servicoRepository.save(servico);
    }
    
    @Override
    public Optional<Servico> getByIdServico(Integer codServico) {
        return servicoRepository.findById(codServico);
    }

    @Override
    public Servico atualizaServico(Servico servico) {
        return servicoRepository.save(servico);
    }

    @Override
    public void deleteByIdServico(Integer codServico) {
        servicoRepository.deleteById(codServico);
    }
    
}
