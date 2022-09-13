package com.softic.softa.controllers;

import com.softic.softa.entities.Enterprise;
import com.softic.softa.entities.Transaction;
import com.softic.softa.services.ServicesEnterprise;
import com.softic.softa.services.ServicesMovTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ControllersRestMovTransaction {
    @Autowired
    ServicesMovTransaction servicesMovTransaction;  //Inyeccion de la dependencia del servicio

    //Metodos
    @GetMapping("/transaction")
    private List<Transaction> verTransaction(){
        return servicesMovTransaction.verTransaction();
    }

    @PostMapping("/transaction")
    private void crearTransaction(@RequestBody Transaction transaction){
        servicesMovTransaction.crearYActualizarTransaction(transaction);
    }

    @DeleteMapping("/transaction/{idTransaction}")
    private void eliminarTransaction(@PathVariable("idTransaction") Long idTransaction){
        servicesMovTransaction.eliminarTransaction(idTransaction);
    }

    @PatchMapping(value = "/transaction")
    private void editarTransaction(@RequestBody Transaction transaction){
        servicesMovTransaction.crearYActualizarTransaction(transaction);


// Put se usa para modificar todo el registro
// Patch se usa para modificar un solo campo

    }
}
