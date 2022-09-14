package com.example.demo.service;

import com.example.demo.model.Empresa;
import com.example.demo.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

public class EmpresaServiceImpl implements EmpresaService {

    @Autowired
    private EmpresaRepository EmpresaRepository;

    @Override
    public List<Empresa> ListaEmpresas () {
        return EmpresaRepository.findAll();
    }
}
