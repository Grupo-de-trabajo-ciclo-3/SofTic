package demo.repositorios;

import demo.entidadesSi.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepo extends JpaRepository<Empleado, Long> {

}
