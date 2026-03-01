package Operaciones;

import Modelos.Empleado;
import Modelos.Empresa;
import java.util.ArrayList;
import java.util.List;

public class OperacionEmpleado implements IOperacionEmpleado {

    private List<Empleado> listaEmpleados;

    public OperacionEmpleado() {
        listaEmpleados = new ArrayList<>();
    }

    @Override
    public void agregarEmpleado(Empleado empleado) {
        listaEmpleados.add(empleado);
    }

    @Override
    public List<Empleado> listarEmpleados() {
        return listaEmpleados;
    }

    @Override
    public Empleado buscarPorDocumento(String documento) {
        for (Empleado e : listaEmpleados) {
            if (e.getDocumento().equals(documento)) {
                return e;
            }
        }
        return null;
    }

    @Override
    public double calcularSueldo(String documento) {
        Empleado e = buscarPorDocumento(documento);
        if (e != null) {
            return e.getSueldoHora() * e.getHorasTrabajadas();
        }
        return 0;
    }

    @Override
    public int contarEmpleadosPorEmpresa(Empresa empresa) {
        int contador = 0;
        for (Empleado e : listaEmpleados) {
            if (e.getEmpresa() != null && e.getEmpresa().equals(empresa)) {
                contador++;
            }
        }
        return contador;
    }
}