package com.example.demo.service;

import com.example.demo.model.Cidade;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author gabrielvitoretti
 */
public interface CidadeService {

    public List<Cidade> listaCidades();

    public Optional<Cidade> getByIdCidade(Integer codCidade);

    public Cidade atualizaCidade(Cidade cidade);

    public void deleteByIdCidade(Integer codCidade);

    public Cidade salvaCidade(Cidade cidade);
}
