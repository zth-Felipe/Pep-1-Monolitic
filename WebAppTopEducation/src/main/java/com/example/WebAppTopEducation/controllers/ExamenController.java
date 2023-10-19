package com.example.WebAppTopEducation.controllers;


import com.example.WebAppTopEducation.entities.ExamenEntity;
import com.example.WebAppTopEducation.services.ExamenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping
public class ExamenController {
    @Autowired
    ExamenService examenService;

    @GetMapping("/listarExamenes")
    public String listarExamenes(Model model){
        ArrayList<ExamenEntity> examen=examenService.obtenerExamenes();
        model.addAttribute("examenes",examen);
        return "index";
    }
}
