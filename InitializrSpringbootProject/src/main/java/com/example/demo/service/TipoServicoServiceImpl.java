package com.example.demo.service;

import com.example.demo.model.TipoServico;
import com.example.demo.repository.TipoServicoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoServicoServiceImpl implements TipoServicoService {
    
    @Autowired
    private TipoServicoRepository tipoServicoRepository;
    
    @Override
    public List<TipoServico> listaTipoServicos() {
        return tipoServicoRepository.findAll();
    }
}
