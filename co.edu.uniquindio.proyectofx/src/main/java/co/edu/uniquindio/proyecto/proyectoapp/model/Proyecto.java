package co.edu.uniquindio.proyecto.proyectoapp.model;

import co.edu.uniquindio.proyecto.proyectoapp.builder.ProyectoBuilder;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.List;

public class Proyecto {
    private String nombreProyecto, codigoProyecto, departamentoProyecto;

    private List<Empleado> listaEmpleados = new ArrayList<>();

    public Proyecto(){

    }

    public Proyecto(String nombreProyecto, String codigoProyecto, String departamentoProyecto, List<Empleado> listaEmpleados) {
        this.nombreProyecto = nombreProyecto;
        this.codigoProyecto = codigoProyecto;
        this.departamentoProyecto = departamentoProyecto;
        this.listaEmpleados = listaEmpleados;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public String getCodigoProyecto() {
        return codigoProyecto;
    }

    public ObservableList<Empleado> getListaEmpleados() {
        return (ObservableList<Empleado>) listaEmpleados;
    }


    public String getDepartamentoProyecto() {
        return departamentoProyecto;
    }

    @Override
    public String toString() {
        return "Proyecto{" +
                "nombreProyecto='" + nombreProyecto + '\'' +
                ", codigoProyecto='" + codigoProyecto + '\'' +
                ", departamento=" + departamentoProyecto +
                ", listaEmpleados=" + listaEmpleados +
                '}';
    }

    public static ProyectoBuilder builder(){
        return new ProyectoBuilder();
    }
}
