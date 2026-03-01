package Modelos;

public class GestorProyectos extends Empleado {

    private String area;

    public GestorProyectos() {
        super();
    }

    public GestorProyectos(String documento, String nombre, double sueldoHora, int horasTrabajadas, String area) {
        super(documento, nombre, sueldoHora, horasTrabajadas);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}