package com.example.WebAppTopEducation.services;


import com.example.WebAppTopEducation.entities.EstudianteEntity;
import com.example.WebAppTopEducation.entities.TipoColegioEntity;
import com.example.WebAppTopEducation.repositories.TipoColegioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class TipoColegioService {
    @Autowired
    TipoColegioRepository tipoColegioRepository;
    public ArrayList<TipoColegioEntity> obtenerTiposColegios(){
        return (ArrayList<TipoColegioEntity>) tipoColegioRepository.findAll();
    }
    public Optional<TipoColegioEntity> obtenerPorId(Long id_colegio){
        return tipoColegioRepository.findById(id_colegio);
    }
}
