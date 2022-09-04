package com.softic.SofTA.entities;

public class MovimientoDinero {
    private  String conceptoMovimiento;
    private double montoMovimiento;
    private  String users;

    public MovimientoDinero(String conceptoMovimiento, double montoMovimiento, String users) {
        this.conceptoMovimiento = conceptoMovimiento;
        this.montoMovimiento = montoMovimiento;
        this.users = users;
    }

    public String getConceptoMovimiento() {
        return conceptoMovimiento;
    }

    public void setConceptoMovimiento(String conceptoMovimiento) {
        this.conceptoMovimiento = conceptoMovimiento;
    }

    public double getMontoMovimiento() {
        return montoMovimiento;
    }

    public void setMontoMovimiento(double montoMovimiento) {
        this.montoMovimiento = montoMovimiento;
    }

    public String getUser() {
        return users;
}
}
