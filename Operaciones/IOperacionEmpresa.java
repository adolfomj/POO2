package Operaciones;

import Modelos.Empresa;
import java.util.List;

public interface IOperacionEmpresa {

    void agregarEmpresa(Empresa empresa);

    List<Empresa> listarEmpresas();

    Empresa buscarPorNit(String nit);
}