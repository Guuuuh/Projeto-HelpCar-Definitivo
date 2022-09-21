package com.example.demo.service;

import com.example.demo.model.Empresa;
import com.example.demo.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;

public class EmpresaServiceImpl implements EmpresaService {

    @Autowired
    private EmpresaRepository empresaRepository;
    
    //salva empresas
    @Override
    public Empresa salvaEmpresa (Empresa empresa){
        return empresaRepository.save(empresa);
    }
    
    //lista todas as empresas
    @Override
    public List<Empresa> listaEmpresas () {
        return empresaRepository.findAll();
    }
    
    //busca pelo id
    @Override
    public Optional<Empresa> getByIdEmpresa (Integer codEmpresa) {
        return empresaRepository.findById(codEmpresa);
    }
    
    //atualiza a empresa
    @Override
    public Empresa atualizaEmpresa (Empresa empresa){
        return empresaRepository.save(empresa);
    }
    
    //deleta empresa
    @Override
    public void deleteByIdEmpresa (Integer codEmpresa){
        empresaRepository.deleteById(codEmpresa);
    }
    
}
