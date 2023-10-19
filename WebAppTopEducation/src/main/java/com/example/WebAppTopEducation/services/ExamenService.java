package com.example.WebAppTopEducation.services;

import com.example.WebAppTopEducation.entities.ExamenEntity;
import com.example.WebAppTopEducation.repositories.ExamenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ExamenService {
    @Autowired
    ExamenRepository examenRepository;

    public ArrayList<ExamenEntity> obtenerExamenes(){
        return (ArrayList<ExamenEntity>) examenRepository.findAll();
    }

    public ExamenEntity guardarExamen(ExamenEntity examen){
        return examenRepository.save(examen);
    }

    public Optional<ExamenEntity> obtenerPorIdExamen(Long id){
        return examenRepository.findById(id);
    }
    public boolean eliminarExamen(Long id){
        try{
            examenRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }
}
