package com.example.WebAppTopEducation.controllers;


import com.example.WebAppTopEducation.entities.TipoColegioEntity;
import com.example.WebAppTopEducation.services.TipoColegioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping
public class TipoColegioController {
    @Autowired
    TipoColegioService tipoColegioService;

    @GetMapping("/listarTC")
    public String listarTC(Model model){
        ArrayList<TipoColegioEntity>tipocolegio=tipoColegioService.obtenerTiposColegios();
        model.addAttribute("tiposColegios", tipocolegio);
        return "index";
    }
}
