package entidadesSi;

public class Empresa {
    String nombreEmpresa;
    String direccion;
    String telefono;
    int nit;

    public Empresa(String nombreEmpresa, String direccion, String telefono, int nit) {
        this.nombreEmpresa = nombreEmpresa;
        this.direccion = direccion;
        this.telefono = telefono;
        this.nit = nit;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }
//metodos para leer y para modificar el nombre de la empresa

    @Override
    public String toString() {
        return "Empresa{" +
                "nombreEmpresa='" + nombreEmpresa + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", nit=" + nit +
                '}';
    }
    public String cname (String nombre){
        //se obtiene el nombre de la empresa
        getNombreEmpresa();

        //con el set se asigna lo que hay en el parametro nombre a nombreempresa
        setNombreEmpresa(nombre);

        //y creo que retornamos el nombre
        return nombre;
    }



    //metodos o funciones, las funciones solo se llaman y se ejecutan debido al parametro que se requiera
    //los metodos para ejecutarl
    // os debemos ponnerlo en una funcion



    public String cambioDireccion(String nuevadireccion){
        System.out.println(this.direccion);
        getDireccion();
        setDireccion(nuevadireccion);
        System.out.println("esta es la nueva direccion: "+this.direccion);
        return this.direccion;
    }
    public String cambioTelefono(String newTelefono){
        getTelefono();
        setTelefono(newTelefono);
        return this.telefono;
    }
    public int cambioNit(int nuevoNit){
        getNit();
        setNit(nuevoNit);
        return this.nit;
    }

}
