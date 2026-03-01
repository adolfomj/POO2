# POO2
Hola profesor aqui le adjunto el codigo que utilicé para el diagrama

@startuml
' ===== CLASES =====

abstract class Empleado {
  - documento : String
  - nombre : String
  - sueldoHora : double
  - horasTrabajadas : int

  + Empleado()
  + Empleado(documento:String, nombre:String, sueldoHora:double, horasTrabajadas:int)
  + getDocumento() : String
  + setDocumento(documento:String) : void
  + getNombre() : String
  + setNombre(nombre:String) : void
  + getSueldoHora() : double
  + setSueldoHora(sueldoHora:double) : void
  + getHorasTrabajadas() : int
  + setHorasTrabajadas(horasTrabajadas:int) : void
}

class Desarrollador
class Admin

class GestorProyectos {
  - area : String
  + getArea() : String
  + setArea(area:String) : void
}

class Empresa {
  - nit : String
  - nombre : String
  - direccion : String
  - ciudad : String

  + Empresa()
  + Empresa(nit:String, nombre:String, direccion:String, ciudad:String)
  + getNit() : String
  + setNit(nit:String) : void
  + getNombre() : String
  + setNombre(nombre:String) : void
  + getDireccion() : String
  + setDireccion(direccion:String) : void
  + getCiudad() : String
  + setCiudad(ciudad:String) : void
}

class EmpresaDesarrollo

' ===== HERENCIA =====

Empleado <|-- Desarrollador
Empleado <|-- Admin
Empleado <|-- GestorProyectos

Empresa <|-- EmpresaDesarrollo

' ===== RELACION =====

Empleado "1" --> "1" Empresa : trabaja en
@enduml
