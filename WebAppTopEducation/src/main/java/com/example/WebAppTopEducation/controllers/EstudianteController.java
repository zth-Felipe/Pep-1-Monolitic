package com.example.WebAppTopEducation.controllers;


import com.example.WebAppTopEducation.entities.EstudianteEntity;
import com.example.WebAppTopEducation.services.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping
public class EstudianteController {
    @Autowired
    EstudianteService estudianteService;

    @GetMapping("/listarEstudiantes")
    public String listarEstudiantes(Model model){
        ArrayList<EstudianteEntity>estudiante=estudianteService.obtenerEstudiantes();
        model.addAttribute("estudiantes",estudiante);
        return "index";
    }
}
