package Patrones.Ejer1;

public class Proveedor {

    private String nombre;
    private String apellido;
    private String cuit;

    public Proveedor(String nombre, String apellido, String cuit) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuit = cuit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }
}
