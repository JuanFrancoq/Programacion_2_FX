package co.edu.uniquindio.proyecto.proyectoapp.builder;

import co.edu.uniquindio.proyecto.proyectoapp.model.Empleado;
import co.edu.uniquindio.proyecto.proyectoapp.model.Proyecto;

import java.util.ArrayList;
import java.util.List;

public class ProyectoBuilder {
    protected String nombreProyecto,codigoProyecto, departamentoProyecto;
    protected List<Empleado> listaEmpleados = new ArrayList<>();

    public ProyectoBuilder setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
        return this;
    }

    public ProyectoBuilder setCodigoProyecto(String codigoProyecto) {
        this.codigoProyecto = codigoProyecto;
        return this;
    }

    public ProyectoBuilder setDepartamentoProyecto(String departamentoProyecto) {
        this.departamentoProyecto = departamentoProyecto;
        return this;
    }

    public ProyectoBuilder setListaEmpleados(List<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
        return this;
    }

    public Proyecto build() {
        return  new Proyecto(nombreProyecto, codigoProyecto, departamentoProyecto, listaEmpleados);
    }
}
