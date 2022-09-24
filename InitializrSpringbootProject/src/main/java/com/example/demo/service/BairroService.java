
package com.example.demo.service;

import com.example.demo.model.Bairro;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author gabrielvitoretti
 */
public interface BairroService {
    public List<Bairro> listaBairros();
    
    public Optional<Bairro> getByIdBairro(Integer codBairro);
    
    public Bairro atualizaBairro(Bairro bairro);
    
    public void deleteByIdBairro(Integer codBairro);
}
