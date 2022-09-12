package demo.servicios;

import demo.entidadesSi.Empresa;
import demo.repositorios.EmpresaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServicioEmpresa {
    @Autowired
    EmpresaRepositorio empresaRepositorio;
    Empresa empresa1;
    Empresa empresa2;
    private ArrayList<Object> listaEmpresa;

    public void crearEmpresalocal(){
        this.empresa1 = new Empresa("iwinser","calle13","wer",1133);
        this.empresa2 = new Empresa("Dylan","calle8","war",122111);
        this.listaEmpresa = new ArrayList<>();
        listaEmpresa.add(empresa1);
        listaEmpresa.add(empresa2);
    }
    public ArrayList<Object> getListaEmpresa(){
        return this.listaEmpresa;
    }





    public void nuevaEmpresa (Empresa empresa){
        empresaRepositorio.save(empresa);
    }
    public List<Empresa> verEmpresa(){
        List<Empresa> empresas = new ArrayList<>();
        empresas.addAll(empresaRepositorio.findAll());
        return empresas;
    }
}
