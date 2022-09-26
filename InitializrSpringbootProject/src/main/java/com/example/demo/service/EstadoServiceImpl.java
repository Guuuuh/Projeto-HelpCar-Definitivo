package com.example.demo.service;

import com.example.demo.model.Estado;
import com.example.demo.repository.EstadoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author goularte
 */
@Service
public class EstadoServiceImpl implements EstadoService {

    @Autowired
    private EstadoRepository estadoRepository;

    @Override
    public List<Estado> listaEstados() {
        return estadoRepository.findAll();
    }

    @Override
    public Optional<Estado> getByIdEstado(Integer codEstado) {
        return estadoRepository.findById(codEstado);
    }

    @Override
    public Estado atualizaEstado(Estado estado) {
        return estadoRepository.save(estado);
    }

    @Override
    public void deleteByIdEstado(Integer codEstado) {
        estadoRepository.deleteById(codEstado);
    }

    @Override
    public Estado salvaEstado(Estado estado) {
        return estadoRepository.save(estado);
    }

}
