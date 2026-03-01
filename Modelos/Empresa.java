package Modelos;

public class Empresa {

    private String nit;
    private String nombre;
    private String direccion;
    private String ciudad;

    // Constructor vacío
    public Empresa() {
    }

    // Constructor completo
    public Empresa(String nit, String nombre, String direccion, String ciudad) {
        this.nit = nit;
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

    // Getters
    public String getNit() {
        return nit;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    // Setters
    public void setNit(String nit) {
        this.nit = nit;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "NIT: " + nit +
               ", Nombre: " + nombre +
               ", Ciudad: " + ciudad;
    }
}