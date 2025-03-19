module co.edu.uniquindio.proyecto.proyectoapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens co.edu.uniquindio.proyecto.proyectoapp to javafx.fxml;
    exports co.edu.uniquindio.proyecto.proyectoapp;

    opens   co.edu.uniquindio.proyecto.proyectoapp.controller;

    exports co.edu.uniquindio.proyecto.proyectoapp.controller;

    opens co.edu.uniquindio.proyecto.proyectoapp.model to javafx.base;

}