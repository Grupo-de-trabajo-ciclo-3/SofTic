package entidadesSi;

import javax.persistence.*;

@Entity
@Table
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String nombre;
    private String correo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Empleado() {
    }

    public Empleado(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }
    public String cambioNombre (String nombreEmpleado){
        getNombre();
        System.out.println("este es el nommbre actual"+this.nombre);
        setNombre(nombreEmpleado);
        System.out.println("este es el nommbre actualizado y nuevo"+this.nombre);
        return nombreEmpleado;
    }
    public String cambioCorreo (String newCorreo){
        getCorreo();
        System.out.println("este es el nommbre correo : "+this.correo);
        setCorreo(newCorreo);
        System.out.println("este es el correo actualizado y nuevo: "+this.correo);
        return this.correo;
    }
}
