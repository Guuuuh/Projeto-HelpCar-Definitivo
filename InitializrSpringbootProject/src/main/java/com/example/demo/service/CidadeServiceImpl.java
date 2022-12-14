
package com.example.demo.service;

import com.example.demo.model.Cidade;
import com.example.demo.repository.CidadeRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author gabrielvitoretti
 */
@Service
public class CidadeServiceImpl implements CidadeService {

    @Autowired
    private CidadeRepository cidadeRepository;

    @Override
    public List<Cidade> listaCidades() {
        return cidadeRepository.findAll();
    }

    @Override
    public Optional<Cidade> getByIdCidade(Integer codCidade) {
        return cidadeRepository.findById(codCidade);
    }

    @Override
    public Cidade atualizaCidade(Cidade cidade) {
        return cidadeRepository.save(cidade);
    }

    @Override
    public void deleteByIdCidade(Integer codCidade) {
        cidadeRepository.deleteById(codCidade);
    }

    @Override
    public Cidade salvaCidade(Cidade cidade) {
        return cidadeRepository.save(cidade);
    }
}
