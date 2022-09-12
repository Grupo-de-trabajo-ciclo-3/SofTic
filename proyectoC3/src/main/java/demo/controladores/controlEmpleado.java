package demo.controladores;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controlEmpleado {
    @GetMapping("/ver1")
    public String ver(){
        return "holamundo";
    }
}
