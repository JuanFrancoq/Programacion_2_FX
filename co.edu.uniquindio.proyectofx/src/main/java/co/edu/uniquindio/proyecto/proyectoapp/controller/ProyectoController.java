package co.edu.uniquindio.proyecto.proyectoapp.controller;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.proyecto.proyectoapp.builder.ProyectoBuilder;
import co.edu.uniquindio.proyecto.proyectoapp.model.Empleado;
import co.edu.uniquindio.proyecto.proyectoapp.builder.EmpleadoBuilder;
import co.edu.uniquindio.proyecto.proyectoapp.model.Proyecto;
import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ProyectoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtNombreEmpleado;

    @FXML
    private TableColumn<Proyecto, String> clCodigoProyecto;

    @FXML
    private Button btnActualizarProyecto;

    @FXML
    private TableColumn<Empleado, String> clNombreEmpleado;

    @FXML
    private Button btnAgregarEmpleado;

    @FXML
    private TextField txtDepartamentoEmpleado;

    @FXML
    private Button btnEliminarProyecto;

    @FXML
    private ComboBox<Empleado> cmbListaEmpleados;

    @FXML
    private TableView<Proyecto> tblProyectos;

    @FXML
    private TableColumn<Proyecto, String> clListaEmpleados;

    @FXML
    private TextField txtNombreProyecto;

    @FXML
    private TableColumn<Proyecto, String> clNombreProyecto;

    @FXML
    private TableView<Empleado> tblEmpleados;

    @FXML
    private Button btnEliminarEmpleado;

    @FXML
    private Button btnCrearProyecto;

    @FXML
    private TableColumn<Empleado, String> clCodigoEmpleado;

    @FXML
    private TextField txtCodigoEmpleado;

    @FXML
    private TableColumn<Empleado, String> clDepartamentoEmpleado;

    @FXML
    private TableColumn<Proyecto, String> clDepartamentoProyecto;

    @FXML
    private TextField txtDepartamentoProyecto;

    @FXML
    private TextField txtCodigoProyecto;

    @FXML
    void initialize() {

        clCodigoEmpleado.setCellValueFactory(new PropertyValueFactory<>("codigoEmpleado"));
        clNombreEmpleado.setCellValueFactory(new PropertyValueFactory<>("nombreEmpleado"));
        clDepartamentoEmpleado.setCellValueFactory(new PropertyValueFactory<>("departamentoEmpleado"));
        tblEmpleados.setItems(listaEmpleados);
        cmbListaEmpleados.setItems(listaEmpleados);

        clNombreProyecto.setCellValueFactory(new PropertyValueFactory<>("nombreProyecto"));
        clCodigoProyecto.setCellValueFactory(new PropertyValueFactory<>("codigoProyecto"));
        clDepartamentoProyecto.setCellValueFactory(new PropertyValueFactory<>("departamentoProyecto"));
        tblProyectos.setItems(listaProyectos);
        clListaEmpleados.setCellValueFactory(cellData ->
                new SimpleStringProperty(String.join(", ",
                        cellData.getValue().getListaEmpleados().stream()
                                .map(Empleado::getNombreEmpleado)
                                .toList()
                ))
        );
    }
    private ObservableList<Proyecto> listaProyectos = FXCollections.observableArrayList();
    private ObservableList<Empleado> listaEmpleados = FXCollections.observableArrayList();

    @FXML
    void onCrearProyecto( ) {
        crearProyecto();
    }
    public void crearProyecto(){
        ProyectoBuilder proyectoBuilder = new ProyectoBuilder();
        proyectoBuilder.setNombreProyecto(txtNombreProyecto.getText());
        proyectoBuilder.setCodigoProyecto(txtCodigoProyecto.getText());
        proyectoBuilder.setDepartamentoProyecto(txtDepartamentoProyecto.getText());
        proyectoBuilder.setListaEmpleados(FXCollections.observableArrayList(cmbListaEmpleados.getItems()));

        Proyecto proyecto = proyectoBuilder.build();
        listaProyectos.add(proyecto);

    }

    @FXML
    void onEliminarProyecto( ) {
        Proyecto proyectoSeleccionado = tblProyectos.getSelectionModel().getSelectedItem();
        if(proyectoSeleccionado != null){
            listaProyectos.remove(proyectoSeleccionado);
        }
    }

    @FXML
    void onActualizarProyecto() {
        Proyecto proyectoSeleccionado = tblProyectos.getSelectionModel().getSelectedItem();

        if (proyectoSeleccionado != null) {
            ProyectoBuilder proyectoBuilder = new ProyectoBuilder();
            proyectoBuilder.setNombreProyecto(txtNombreProyecto.getText());
            proyectoBuilder.setCodigoProyecto(txtCodigoProyecto.getText());
            proyectoBuilder.setDepartamentoProyecto(txtDepartamentoProyecto.getText());
            proyectoBuilder.setListaEmpleados(FXCollections.observableArrayList(cmbListaEmpleados.getItems()));
            Proyecto proyectoActualizado = proyectoBuilder.build();
            int index = listaProyectos.indexOf(proyectoSeleccionado);
            if (index != -1) {
                listaProyectos.set(index, proyectoActualizado);
            }
            tblProyectos.refresh();
        }
    }

    @FXML
    void onAgregarEmpleado( ) {
        crearEmpleado();
    }
    private void crearEmpleado() {
        EmpleadoBuilder empleadoBuilder = new EmpleadoBuilder();
        empleadoBuilder.setNombreEmpleado(txtNombreEmpleado.getText());
        empleadoBuilder.setCodigoEmpleado(txtCodigoEmpleado.getText());
        empleadoBuilder.setDepartamentoEmpleado(txtDepartamentoEmpleado.getText());

        Empleado empleado = empleadoBuilder.build();
        listaEmpleados.add(empleado);

    }

    @FXML
    void onEliminarEmpleado( ) {
        Empleado empleadoSeleccionado = tblEmpleados.getSelectionModel().getSelectedItem();
        if(empleadoSeleccionado != null) {
            listaEmpleados.remove(empleadoSeleccionado);
        }
    }
}
























