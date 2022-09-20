package com.example.demo.service;

import com.example.demo.model.TipoServico;
import java.util.List;
import java.util.Optional;

public interface TipoServicoService {
    
    public TipoServico salvaTipoServico(TipoServico tipoServico);
    
    public List<TipoServico> listaTipoServicos();
    
    public Optional<TipoServico> getByIdTipoServico(Integer codTipoServico);
    
    public TipoServico atualizaTipoServico(TipoServico tiposervico);
    
    public void deleteByIdTipoServico (Integer codTipoServico);
    
}
