package com.example.demo.service;

import com.example.demo.model.Bairro;
import com.example.demo.repository.BairroRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author gabrielvitoretti
 */
@Service
public class BairroServiceImpl implements BairroService {

    @Autowired
    private BairroRepository bairroRepository;

    @Override
    public List<Bairro> listaBairros() {
        return bairroRepository.findAll();
    }

    @Override
    public Optional<Bairro> getByIdBairro(Integer codBairro) {
        return bairroRepository.findById(codBairro);
    }

    @Override
    public Bairro atualizaBairro(Bairro bairro) {
        return bairroRepository.save(bairro);
    }

    @Override
    public void deleteByIdBairro(Integer codBairro) {
        bairroRepository.deleteById(codBairro);
    }

    @Override
    public Bairro salvaBairro(Bairro bairro) {
        return bairroRepository.save(bairro);
    }

}
