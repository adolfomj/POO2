package Modelos;

public class Empleado {

    private String documento;
    private String nombre;
    private double sueldoHora;
    private int horasTrabajadas;
    private Empresa empresa;

    // Constructor vacío
    public Empleado() {
    }

    // Constructor completo
    public Empleado(String documento, String nombre, double sueldoHora, int horasTrabajadas) {
        this.documento = documento;
        this.nombre = nombre;
        this.sueldoHora = sueldoHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    // Método para calcular sueldo
    public double calcularSueldo() {
        return sueldoHora * horasTrabajadas;
    }

    // Getters
    public String getDocumento() {
        return documento;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSueldoHora() {
        return sueldoHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    // Setters
    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSueldoHora(double sueldoHora) {
        this.sueldoHora = sueldoHora;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return "Documento: " + documento +
               ", Nombre: " + nombre +
               ", Empresa: " + (empresa != null ? empresa.getNombre() : "Sin empresa");
    }
}