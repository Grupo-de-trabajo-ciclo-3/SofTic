package com.example.demo.repositorios;

import com.example.demo.entidadesSi.MovimientoDinero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovDineroRepo extends JpaRepository<MovimientoDinero, Long> {
}
