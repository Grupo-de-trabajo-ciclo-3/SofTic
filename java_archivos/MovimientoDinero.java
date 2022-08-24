package movimientosDinero;

import lombok.Data;

import java.util.Objects;
@Data
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

    public static void main(String[] args) {
        var primermov = new MovimientoDinero("ingreso", 3000, "admin");
        System.out.println(primermov.toString());
        int mov = movDiner(primermov.getMontoMovimiento(), 9);
        primermov.setMontoMovimiento(mov);
        System.out.println(primermov.toString());
    }


    static int movDiner(int montoMovimiento, int b){

        int y = montoMovimiento + b;
        System.out.println(y);
        return y;
    }
}
