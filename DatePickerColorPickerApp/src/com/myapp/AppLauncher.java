package com.myapp;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.time.format.DateTimeFormatter;

public class AppLauncher extends Application {  // Definición de la clase

    @Override
    public void start(Stage primaryStage) {
        // Crear los componentes
        Label dateLabel = new Label("Selecciona una fecha:");
        DatePicker datePicker = new DatePicker();

        Label colorLabel = new Label("Selecciona un color:");
        ColorPicker colorPicker = new ColorPicker();

        Button confirmButton = new Button("Confirmar Selección");

        // Acción al presionar el botón
        confirmButton.setOnAction(e -> {
            // Obtener la fecha seleccionada
            String selectedDate = datePicker.getValue().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
            // Obtener el color seleccionado
            String selectedColor = colorPicker.getValue().toString();

            // Mostrar las selecciones en la consola
            System.out.println("Fecha seleccionada: " + selectedDate);
            System.out.println("Color seleccionado: " + selectedColor);
        });

        // Organizar los componentes en un VBox
        VBox vbox = new VBox(10, dateLabel, datePicker, colorLabel, colorPicker, confirmButton);

        // Configurar la escena y el escenario
        Scene scene = new Scene(vbox, 300, 200);
        primaryStage.setTitle("Selector de Fecha y Color");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}