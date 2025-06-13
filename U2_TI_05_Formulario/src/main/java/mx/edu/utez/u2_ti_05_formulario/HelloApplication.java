package mx.edu.utez.u2_ti_05_formulario;

import javafx.application.Application;
import javafx.beans.Observable;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.controlsfx.control.spreadsheet.Grid;

import javax.swing.*;
import javax.swing.text.LabelView;
import java.awt.*;
import java.io.IOException;
import java.util.List;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Label labelName = new Label("Nombre:");
        TextField textFieldName = new TextField();
        Label labelLastName = new Label("Apellido:");
        TextField textFieldLastName = new TextField();
        Label labelAge = new Label("Edad:");
        TextField textFieldAge = new TextField();
        Label labelrol = new Label("Rol: ");

        ComboBox<String> comboBoxRol = new ComboBox<>();
        comboBoxRol.getItems().addAll("Estudiante", "Profesor", "Administrador");

        Button btncrear = new Button("Crear");
        Button btnreset = new Button("Reset");
        Label labelresultado = new Label("Resultado");

        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);

        grid.add(labelName,1,1);
        grid.add(textFieldName,2,1);
        grid.add(labelLastName,1,2);
        grid.add(textFieldLastName,2,2);
        grid.add(labelAge,1,3);
        grid.add(textFieldAge,2,3);
        grid.add(labelrol,1,4);
        grid.add(comboBoxRol,2,4);
        grid.add(btncrear,1,6);
        grid.add(btnreset,2,6);
        grid.add(labelresultado,3,6);

        btncrear.setOnAction(e -> {
            if (textFieldName.getText().isEmpty() || textFieldLastName.getText().isEmpty() || textFieldAge.getText().isEmpty() || comboBoxRol.getSelectionModel().getSelectedItem() == null) {
                labelresultado.setText("Todos los campos deben estar llenos");
                labelresultado.setStyle("-fx-text-fill: red;");
                grid.setStyle("-fx-background-color: #daa7a7;");
                textFieldName.setStyle("-fx-background-color: #f38a8a");
                textFieldLastName.setStyle("-fx-background-color: #f38a8a");
                textFieldAge.setStyle("-fx-background-color: #f38a8a");
                comboBoxRol.setStyle("-fx-background-color: #f38a8a");
            }
            else {
                labelresultado.setText("Creado");
                grid.setStyle("-fx-background-color: #94d894;");
                labelresultado.setStyle("-fx-text-fill: lightblue;");
                textFieldName.setStyle("-fx-background-color: #96cf96;");
                textFieldLastName.setStyle("-fx-background-color: #96cf96;");
                textFieldAge.setStyle("-fx-background-color: #96cf96;");
                comboBoxRol.setStyle("-fx-background-color: #96cf96;");
            }
        });

        btnreset.setOnAction(e -> {
            labelresultado.setText("");
            textFieldName.clear();
            textFieldName.setStyle("");
            textFieldLastName.clear();
            textFieldLastName.setStyle("");
            textFieldAge.clear();
            textFieldAge.setStyle("");
            comboBoxRol.getSelectionModel().clearSelection();
            comboBoxRol.setStyle("");
            grid.setStyle("");
        });

        Scene scene = new Scene(grid, 845, 720);
        stage.setTitle("Form!");
        javafx.scene.image.Image image = new Image(getClass().getResourceAsStream("/image/icons8-terraria-32.png"));
        stage.getIcons().add(image);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}