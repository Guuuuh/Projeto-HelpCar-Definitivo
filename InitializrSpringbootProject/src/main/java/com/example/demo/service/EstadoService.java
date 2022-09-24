package com.example.demo.service;

import com.example.demo.model.Estado;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author goularte
 */
public interface EstadoService {

    public List<Estado> listaEstados();

    public Optional<Estado> getByIdEstado(Integer codEstado);

    public Estado atualizaEstado(Estado estado);

    public void deleteByIdEstado(Integer codEstado);
}
