package entidadesSi;

public class MovimientoDinero {

    private int montoDinero;
    private String conceptoMonto;

    public MovimientoDinero(int montoDinero, String conceptoMonto) {
        this.montoDinero = montoDinero;
        this.conceptoMonto = conceptoMonto;
    }

    public int getMontoDinero() {
        return montoDinero;
    }

    public void setMontoDinero(int montoDinero) {
        this.montoDinero = montoDinero;
    }

    public String getConceptoMonto() {
        return conceptoMonto;
    }

    public void setConceptoMonto(String conceptoMonto) {
        this.conceptoMonto = conceptoMonto;
    }


}
