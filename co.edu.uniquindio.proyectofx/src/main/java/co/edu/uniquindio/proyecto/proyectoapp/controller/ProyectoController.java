package co.edu.uniquindio.proyecto.proyectoapp.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ProyectoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtNombreEmpleado;

    @FXML
    private Button btnActualizarProyecto;

    @FXML
    private Button btnEliminarEmpleado;

    @FXML
    private Button btnCrearProyecto;

    @FXML
    private TextField txtCodigoEmpleado;

    @FXML
    private Button btnAgregarEmpleado;

    @FXML
    private Button btnEliminarProyecto;

    @FXML
    private TextField txtNombreProyecto;

    @FXML
    private TextField txtCodigoProyecto;

    @FXML
    void initialize() {
        assert txtNombreEmpleado != null : "fx:id=\"txtNombreEmpleado\" was not injected: check your FXML file 'Proyecto.fxml'.";
        assert btnActualizarProyecto != null : "fx:id=\"btnActualizarProyecto\" was not injected: check your FXML file 'Proyecto.fxml'.";
        assert btnEliminarEmpleado != null : "fx:id=\"btnEliminarEmpleado\" was not injected: check your FXML file 'Proyecto.fxml'.";
        assert btnCrearProyecto != null : "fx:id=\"btnCrearProyecto\" was not injected: check your FXML file 'Proyecto.fxml'.";
        assert txtCodigoEmpleado != null : "fx:id=\"txtCodigoEmpleado\" was not injected: check your FXML file 'Proyecto.fxml'.";
        assert btnAgregarEmpleado != null : "fx:id=\"btnAgregarEmpleado\" was not injected: check your FXML file 'Proyecto.fxml'.";
        assert btnEliminarProyecto != null : "fx:id=\"btnEliminarProyecto\" was not injected: check your FXML file 'Proyecto.fxml'.";
        assert txtNombreProyecto != null : "fx:id=\"txtNombreProyecto\" was not injected: check your FXML file 'Proyecto.fxml'.";
        assert txtCodigoProyecto != null : "fx:id=\"txtCodigoProyecto\" was not injected: check your FXML file 'Proyecto.fxml'.";

    }
    
    public void onEliminarProyecto(ActionEvent actionEvent) {
    }

    public void onCrearProyecto(ActionEvent actionEvent) {
    }

    public void onActualizarProyecto(ActionEvent actionEvent) {
    }

    public void onAgregarEmpleado(ActionEvent actionEvent) {
    }

    public void onEliminarEmpleado(ActionEvent actionEvent) {
    }
}

