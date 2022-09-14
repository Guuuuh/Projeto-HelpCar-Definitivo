
package com.example.demo.repository;

import com.example.demo.model.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author gabrielvitoretti
 */
public interface VeiculoRepository extends JpaRepository<Veiculo, Integer>{
    
}
