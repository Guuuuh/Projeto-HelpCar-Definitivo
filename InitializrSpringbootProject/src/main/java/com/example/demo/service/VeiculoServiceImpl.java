
package com.example.demo.service;

import com.example.demo.model.Veiculo;
import com.example.demo.repository.VeiculoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author gabrielvitoretti
 */
@Service
public class VeiculoServiceImpl implements VeiculoService{

    @Autowired
    private VeiculoRepository veiculoRepository;
    
    @Override
    public List<Veiculo> listaVeiculos() {
        return veiculoRepository.findAll();
    }

    @Override
    public Optional<Veiculo> getByIdVeiculo(Integer codVeiculo) {
        return veiculoRepository.findById(codVeiculo);
    }

    @Override
    public Veiculo atualizaVeiculo(Veiculo veiculo) {
        return veiculoRepository.save(veiculo);
    }

    @Override
    public void deleteByIdVeiculo(Integer codVeiculo) {
        veiculoRepository.deleteById(codVeiculo);
    }
    
}
