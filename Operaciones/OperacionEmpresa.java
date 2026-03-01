package Operaciones;

import Modelos.Empresa;
import java.util.ArrayList;
import java.util.List;

public class OperacionEmpresa implements IOperacionEmpresa {

    private List<Empresa> listaEmpresas;

    public OperacionEmpresa() {
        listaEmpresas = new ArrayList<>();
    }

    @Override
    public void agregarEmpresa(Empresa empresa) {
        listaEmpresas.add(empresa);
    }

    @Override
    public List<Empresa> listarEmpresas() {
        return listaEmpresas;
    }

    @Override
    public Empresa buscarPorNit(String nit) {
        for (Empresa e : listaEmpresas) {
            if (e.getNit().equals(nit)) {
                return e;
            }
        }
        return null;
    }
}