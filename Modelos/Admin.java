package Modelos;

public class Admin extends Empleado {

    public Admin() {
        super();
    }

    public Admin(String documento, String nombre, double sueldoHora, int horasTrabajadas) {
        super(documento, nombre, sueldoHora, horasTrabajadas);
    }
}