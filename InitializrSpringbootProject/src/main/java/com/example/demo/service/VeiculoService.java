
package com.example.demo.service;

import com.example.demo.model.Veiculo;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author gabrielvitoretti
 */
public interface VeiculoService {
    public List<Veiculo> listaVeiculos();
    
    public Optional<Veiculo> getByIdVeiculo(Integer codVeiculo);
    
    public Veiculo salvaVeiculo(Veiculo veiculo);
    
    public Veiculo atualizaVeiculo(Veiculo veiculo);
    
    public void deleteByIdVeiculo(Integer codVeiculo);
}
