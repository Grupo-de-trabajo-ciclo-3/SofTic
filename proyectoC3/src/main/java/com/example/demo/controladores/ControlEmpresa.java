package com.example.demo.controladores;

import com.example.demo.entidadesSi.Empresa;
import com.example.demo.servicios.ServicioEmpresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ControlEmpresa {
    @Autowired
    ServicioEmpresa servicioEmpresa;
    private ServicioEmpresa servicio;

    @GetMapping("vista")
    private String saludo(){
        return "saudando";
    }
    @GetMapping("/hola1")
    private Empresa emp1(){
        Empresa empresa1 =new Empresa("empresanumero1","direccion1","telefono1",23);
        return empresa1;
    }


    @GetMapping("/vista5")
    private List<Empresa> verEmpresa(){
        return servicioEmpresa.verEmpresa();
    }
    /*@GetMapping("/ver")
    public String ver(){
        return "hola mundo ya funciono";

    }
    @GetMapping("/ver2")
    public String ver2(){

        return "hola mundo ya funciono y osy el 2";
    }*/
    @PostMapping("/empresa")
    public void nuevaEmpresa (@RequestBody Empresa empresa){
        servicioEmpresa.nuevaEmpresa(empresa);
    }








    public void controlEmpresa(){
        this.servicio = new ServicioEmpresa();
    }
    @GetMapping("/verempresa")
    public ArrayList<Object> verEmpresas(){
        return this.servicio.getListaEmpresa();
    }
}
