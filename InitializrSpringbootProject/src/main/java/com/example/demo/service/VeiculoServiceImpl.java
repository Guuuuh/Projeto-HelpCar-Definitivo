
package com.example.demo.service;

import com.example.demo.model.Veiculo;
import com.example.demo.repository.VeiculoRepository;
import java.util.List;
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
    
}
