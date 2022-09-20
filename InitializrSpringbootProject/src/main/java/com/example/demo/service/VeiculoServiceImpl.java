
package com.example.demo.service;

import com.example.demo.model.Veiculo;
import com.example.demo.repository.VeiculoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author gabrielvitoretti
 */
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
