package co.edu.uniquindio.proyecto.proyectoapp.builder;

import co.edu.uniquindio.proyecto.proyectoapp.model.Empleado;

public class EmpleadoBuilder {
    protected String nombreEmpleado, codigoEmpleado, departamentoEmpleado;

    public EmpleadoBuilder setNombreEmpleado(String nombreEmpleado){
        this.nombreEmpleado = nombreEmpleado;
        return this;
    }

    public EmpleadoBuilder setCodigoEmpleado(String codigoEmpleado){
        this.codigoEmpleado = codigoEmpleado;
        return this;
    }

    public EmpleadoBuilder setDepartamentoEmpleado(String departamentoEmpleado){
        this.departamentoEmpleado = departamentoEmpleado;
        return this;
    }

    public Empleado build(){
        return new Empleado(nombreEmpleado, codigoEmpleado, departamentoEmpleado);
    }
}
