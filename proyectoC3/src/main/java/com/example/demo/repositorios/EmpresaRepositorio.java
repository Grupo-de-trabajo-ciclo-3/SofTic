package com.example.demo.repositorios;

import com.example.demo.entidadesSi.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRepositorio extends JpaRepository <Empresa, Long> {

}
