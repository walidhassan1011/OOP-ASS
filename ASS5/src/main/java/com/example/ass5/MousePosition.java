package com.example.ass5;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class MousePosition extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override

        public void start(Stage stage) throws IOException {
     //Write a program that displays at the title of the window, the position of the mouse as the user move the mouse around the window
        // 1. Create a label
        // 2. Register a mouse moved event handler that sets the text of the label to the position of the mouse
        // 3. Add the label to a scene
        // 4. Set the scene to the stage
        // 5. Show the stage

        Pane root = new Pane();
        Label label = new Label();
        root.getChildren().add(label);
        root.setOnMouseMoved(e -> {
            label.setText("X: " + e.getX() + " Y: " + e.getY());
        });

        Scene scene = new Scene(root, 320, 240);
        stage.setTitle("Mouse Position");
        stage.setScene(scene);
        stage.show();



    }
}
