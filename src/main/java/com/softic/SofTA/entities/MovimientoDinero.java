package com.softic.SofTA.entities;

public class MovimientoDinero {
    String conceptoMovimiento;
    int montoMovimiento;
    String users;
    int acumulador = 0;
    public MovimientoDinero(String conceptoMovimiento, int montoMovimiento, String users) {
        this.conceptoMovimiento = conceptoMovimiento;
        this.montoMovimiento = montoMovimiento;
        this.users = users;
    }


    public int getMontoMovimiento() {
        return montoMovimiento;
    }

    public void setMontoMovimiento(int montoMovimiento) {
        this.montoMovimiento = montoMovimiento;
    }

    public String getUsers() {
        return users;
    }

    public void setUsers(String users) {
        this.users = users;
    }

    public int getAcumulador() {
        return acumulador;
    }

    public void setAcumulador(int acumulador) {
        this.acumulador = acumulador;
    }
}
