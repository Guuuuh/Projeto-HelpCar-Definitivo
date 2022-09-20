package com.example.demo.service;

import com.example.demo.model.TipoServico;
import com.example.demo.repository.TipoServicoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoServicoServiceImpl implements TipoServicoService {
    
    @Autowired
    private TipoServicoRepository tipoServicoRepository;
    
    @Override
    public TipoServico salvaTipoServico(TipoServico tipoServico) {
        return tipoServicoRepository.save(tipoServico);
    }
    
    @Override
    public List<TipoServico> listaTipoServicos() {
        return tipoServicoRepository.findAll();
    }
    
    @Override
    public Optional<TipoServico> getByIdTipoServico(Integer codTipoServico) {
        return tipoServicoRepository.findById(codTipoServico);
    }

    @Override
    public TipoServico atualizaTipoServico(TipoServico tipoServico) {
        return tipoServicoRepository.save(tipoServico);
    }

    @Override
    public void deleteByIdTipoServico(Integer codTipoServico) {
        tipoServicoRepository.deleteById(codTipoServico);
    }
}
