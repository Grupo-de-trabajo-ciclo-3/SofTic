package com.softic.softa.controllers;

import com.softic.softa.entities.Employee;
import com.softic.softa.services.ServicesEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ControllersRestEmployees{

    @Autowired
    ServicesEmployee servicesEmployee;  //Inyeccion de la dependencia del servicio

    //Metodos
    @GetMapping("/employee")
    private List<Employee> verEmpleado(){
        return servicesEmployee.verEmployee();
    }

    @PostMapping("/employee")
    private void crearEmpleado(@RequestBody Employee employee){
        servicesEmployee.crearYActualizarEmpleado(employee);
    }

    @DeleteMapping("/employee/{idEmployee}")
    private void eliminarEmployee(@PathVariable("idEmployee") Long idEmployee){
        servicesEmployee.eliminarEmployee(idEmployee);
    }

    @PatchMapping("/employee")
    private void editarEmployee(@RequestBody Employee employee){
        servicesEmployee.crearYActualizarEmpleado(employee);

//  Put se usa para modificar todo el registro
//  Patch se usa para modificar un solo campo

//  @PutMapping("/employee")
//  private void editarEmployee(@RequestBody Employee employee){
//      servicesEmployee.crearYActualizarEmpleado(employee);

    }

}

