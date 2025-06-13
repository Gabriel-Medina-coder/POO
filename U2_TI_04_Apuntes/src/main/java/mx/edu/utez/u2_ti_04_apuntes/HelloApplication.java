package mx.edu.utez.u2_ti_04_apuntes;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

        Label lbl = new Label("Label");
        Label lbl2 = new Label("Label2");
        Button btn = new Button("Aceptar");
        Button btn2 = new Button("Cancelar");

        btn.setOnAction(e -> {
            lbl.setText("Aceptado");
        });
        btn2.setOnAction(e -> {
            lbl.setText("Cancelado");
        });

        VBox vbox = new VBox(20, lbl,lbl2, btn, btn2);
        vbox.setAlignment(Pos.CENTER);
        Scene scene = new Scene(vbox, 320, 240);
        stage.setTitle("Terraria!");
        Image image = new Image(getClass().getResourceAsStream("/image/icons8-terraria-32.png"));
        stage.getIcons().add(image);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}