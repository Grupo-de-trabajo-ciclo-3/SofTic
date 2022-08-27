package com.SofTA;

public class Empleado {
    private String empleado;
    private String correo;
    private String empresaEmpleado;
    private String rolEmpleado;

    public Empleado(String empleado, String correo, String empresaEmpleado, String rolEmpleado) {
        this.empleado = empleado;
        this.correo = correo;
        this.empresaEmpleado = empresaEmpleado;
        this.rolEmpleado = rolEmpleado;
    }

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEmpresaEmpleado() {
        return empresaEmpleado;
    }

    public void setEmpresaEmpleado(String empresaEmpleado) {
        this.empresaEmpleado = empresaEmpleado;
    }

    public String getRolEmpleado() {
        return rolEmpleado;
    }

    public void setRolEmpleado(String rolEmpleado) {
        this.rolEmpleado = rolEmpleado;
    }

    @Override
    public String toString() {
        return "Empleado{" + "empleado=" + empleado + ", correo=" + correo + ", empresaEmpleado=" + empresaEmpleado + ", rolEmpleado=" + rolEmpleado + '}';
    }
}
