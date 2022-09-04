package com.softic.SofTA.controllers;

public class ComtroladorRestMovEmpresa {
    import java.util.ArrayList;

    @RestController
    @RequestMapping("/movimiento")
    public class MovimientoController {
        @Autowired
        MovimientoService movimientoService;

        @GetMapping()
        public ArrayList<Movimiento> obtenerMovimientos(){
            return movimientoService.obtenerMovimientos();
        }

        @PostMapping()
        public Movimiento guardarMovimiento(@RequestBody Movimiento movimiento){
            return this.movimientoService.guardarMovimiento(movimiento);
        }
    }
    }
