package com.softic.softa.controllers;

import com.softic.softa.entities.Enterprise;
import com.softic.softa.services.ServicesEnterprise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ControllersRestEnterprises{

    @Autowired
    ServicesEnterprise servicesEnterprise;  //Inyeccion de la dependencia del servicio

    //Metodos
    @GetMapping("/enterprise")
    private List<Enterprise> verEnterprise(){
        return servicesEnterprise.verEnterprise();
    }

    @PostMapping("/enterprise")
    private void crearEnterprise(@RequestBody Enterprise enterprise){
        servicesEnterprise.crearYActualizarEnterprise(enterprise);
    }

    @DeleteMapping("/enterprise/{idEnterprise}")
    private void eliminarEnterprise(@PathVariable("idEnterprise") Long idEnterprise){
        servicesEnterprise.eliminarEnterprise(idEnterprise);
    }

    @PatchMapping(value = "/enterprise")
    private void editarEnterprise(@RequestBody Enterprise enterprise){
        servicesEnterprise.crearYActualizarEnterprise(enterprise);


//  @PutMapping("/enterprise")
//  private void editarEnterprise(@RequestBody Enterprise enterprise){
//      servicesEnterprise.crearYActualizarEnterprise(enterprise);

// Put se usa para modificar todo el registro
// Patch se usa para modificar un solo campo

    }

}
