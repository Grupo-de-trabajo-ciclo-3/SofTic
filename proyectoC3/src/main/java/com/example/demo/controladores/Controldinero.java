package controladores;

import org.springframework.web.bind.annotation.GetMapping;

public class Controldinero {
    @GetMapping("/verdinero")
    public String ver(){
        return "holamundo funciono en local para ver dinero";
    }
}
