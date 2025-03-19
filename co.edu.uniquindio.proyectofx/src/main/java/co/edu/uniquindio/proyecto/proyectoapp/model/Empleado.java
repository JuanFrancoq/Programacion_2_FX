package co.edu.uniquindio.proyecto.proyectoapp.model;

import co.edu.uniquindio.proyecto.proyectoapp.builder.EmpleadoBuilder;

public class Empleado {
    private String nombreEmpleado, codigoEmpleado, departamentoEmpleado;

    public Empleado(){

    }

    public Empleado(String nombreEmpleado, String codigoEmpleado, String departamento) {
        this.nombreEmpleado = nombreEmpleado;
        this.codigoEmpleado = codigoEmpleado;
        this.departamentoEmpleado = departamento;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public String getDepartamentoEmpleado() {
        return departamentoEmpleado;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombreEmpleado='" + nombreEmpleado + '\'' +
                ", codigoEmpleado='" + codigoEmpleado + '\'' +
                ", departamento=" + departamentoEmpleado +
                '}';
    }

    public static EmpleadoBuilder builder (){
        return new EmpleadoBuilder();
    }

}
