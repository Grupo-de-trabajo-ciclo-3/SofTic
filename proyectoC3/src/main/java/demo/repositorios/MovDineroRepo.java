package demo.repositorios;

import demo.entidadesSi.MovimientoDinero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovDineroRepo extends JpaRepository<MovimientoDinero, Long> {
}
