package com.softic.SofTA.entities;

public class Empresa {
    //Atributos
    private String nombreEmpresa;
    private String  direccion;
    private String telefono;
    private String nit;


    //Constructor
    public Empresa(String nombreEmpresa, String direccion, String telefono, String nit) {
        this.nombreEmpresa = nombreEmpresa;
        this.direccion = direccion;
        this.telefono = telefono;
        this.nit = nit;

    }

    @Override
    public String toString() {
        return "Empresa{" + "nombreEmpresa=" + nombreEmpresa + ", direccion=" + direccion + ", telefono=" + telefono + ", nit=" + nit + '}';
    }

    // getter y setter

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
}
