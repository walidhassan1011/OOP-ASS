package com.example.ass5;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

import static javafx.application.Application.launch;

public class PanelColor extends Application {

        public static void main(String[] args) {
        launch();
        }
        @Override

        public void start(Stage stage) throws IOException {
        // program that displays the background color of a panel as black when the mouse is pressed and white when the mouse is released
        // 1. Create a panel
        // 2. Set the background color of the panel to white
        // 3. Register a mouse pressed event handler that sets the background color of the panel to black
        // 4. Register a mouse released event handler that sets the background color of the panel to white
        // 5. Add the panel to a scene
        // 6. Set the scene to the stage
        // 7. Show the stage

                Pane root = new Pane();

                root.setStyle("-fx-background-color: white;");
                root.setOnMousePressed(e -> {
                        root.setStyle("-fx-background-color: black;");
                });
                root.setOnMouseReleased(e -> {
                        root.setStyle("-fx-background-color: white;");
                });
                Scene scene = new Scene(root, 320, 240);
                stage.setTitle("Panel Color");
                stage.setScene(scene);
                stage.show();


        }
}
