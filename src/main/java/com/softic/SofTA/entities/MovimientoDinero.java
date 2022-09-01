package com.softic.SofTA.entities;

public class MovimientoDinero {
    private  String conceptoMovimiento;
    private double montoMovimiento;
    private  String user;

    public MovimientoDinero(String conceptoMovimiento, double montoMovimiento, String user) {
        this.conceptoMovimiento = conceptoMovimiento;
        this.montoMovimiento = montoMovimiento;
        this.user = user;
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
        return user;
}
