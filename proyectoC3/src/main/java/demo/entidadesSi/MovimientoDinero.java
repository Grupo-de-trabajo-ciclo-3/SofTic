package demo.entidadesSi;

import javax.persistence.*;

@Entity
@Table(name = "movdintabla")
public class MovimientoDinero {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;


    @Column(name = "montodinero")
    private int montoDinero;
    @Column(name = "conceptodinero")
    private String conceptoMonto;

    public MovimientoDinero() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
