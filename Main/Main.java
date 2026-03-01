package Main;

import Modelos.*;
import Operaciones.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        IOperacionEmpresa opEmpresa = new OperacionEmpresa();
        IOperacionEmpleado opEmpleado = new OperacionEmpleado();

        int opcion;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Crear empresa");
            System.out.println("2. Crear empleado");
            System.out.println("3. Listar empresas");
            System.out.println("4. Listar empleados");
            System.out.println("5. Buscar empleado por documento");
            System.out.println("6. Calcular sueldo empleado");
            System.out.println("7. Contar empleados por empresa");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); 

            switch (opcion) {

                case 1 -> {
                    System.out.print("NIT: ");
                    String nit = sc.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Dirección: ");
                    String direccion = sc.nextLine();
                    System.out.print("Ciudad: ");
                    String ciudad = sc.nextLine();

                    Empresa NuevaEmpresa = new Empresa(nit, nombre, direccion, ciudad);
                    opEmpresa.agregarEmpresa(NuevaEmpresa);
                    System.out.println("Empresa creada.");
                }

                case 2 -> {
                    System.out.print("Documento: ");
                    String doc = sc.nextLine();
                    System.out.print("Nombre: ");
                    String nomEmp = sc.nextLine();
                    System.out.print("Sueldo por hora: ");
                    double sueldoHora = sc.nextDouble();
                    System.out.print("Horas trabajadas: ");
                    int horas = sc.nextInt();
                    sc.nextLine();

                    System.out.print("NIT empresa: ");
                    String nitEmpresa = sc.nextLine();
                    Empresa empEncontrada = opEmpresa.buscarPorNit(nitEmpresa);

                    if (empEncontrada != null) {
                        Empleado nuevo = new Desarrollador(doc, nomEmp, sueldoHora, horas);
                        nuevo.setEmpresa(empEncontrada);
                        opEmpleado.agregarEmpleado(nuevo);
                        System.out.println("Empleado creado y asignado.");
                    } else {
                        System.out.println("Empresa no encontrada.");
                    }
                }

                case 3 -> {
                    for (Empresa e : opEmpresa.listarEmpresas()) {
                        System.out.println(e.getNit() + " - " + e.getNombre());
                    }
                }

                case 4 -> {
                    for (Empleado e : opEmpleado.listarEmpleados()) {
                        System.out.println(e);
                    }
                }

                case 5 -> {
                    System.out.print("Documento: ");
                    String buscarDoc = sc.nextLine();
                    Empleado encontrado = opEmpleado.buscarPorDocumento(buscarDoc);
                    System.out.println(encontrado != null ? encontrado : "No encontrado");
                }

                case 6 -> {
                    System.out.print("Documento: ");
                    String docSueldo = sc.nextLine();
                    double sueldo = opEmpleado.calcularSueldo(docSueldo);
                    System.out.println("Sueldo: " + sueldo);
                }

                case 7 -> {
                    System.out.print("NIT empresa: ");
                    String nitContar = sc.nextLine();
                    Empresa empContar = opEmpresa.buscarPorNit(nitContar);
                    if (empContar != null) {
                        int cantidad = opEmpleado.contarEmpleadosPorEmpresa(empContar);
                        System.out.println("Cantidad empleados: " + cantidad);
                    } else {
                        System.out.println("Empresa no encontrada.");
                    }
                }

                case 0 -> System.out.println("Saliendo...");

                default -> System.out.println("Opción inválida.");
            }

        } while (opcion != 0);

        sc.close();
    }
}