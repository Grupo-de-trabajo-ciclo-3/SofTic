package com.softic.SofTA.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorRestEmpresa {

    @GetMapping("/")
    public String inicio(){
        return "Primera pagina web";
    }

    @GetMapping("/proyecto")
    public String proyecto(){
        return "Primera pagina web del proyecto";
    }


}
