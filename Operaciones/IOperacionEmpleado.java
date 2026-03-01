package Operaciones;

import Modelos.Empleado;
import Modelos.Empresa;
import java.util.List;

public interface IOperacionEmpleado {

    void agregarEmpleado(Empleado empleado);

    List<Empleado> listarEmpleados();

    Empleado buscarPorDocumento(String documento);

    double calcularSueldo(String documento);

    int contarEmpleadosPorEmpresa(Empresa empresa);
}