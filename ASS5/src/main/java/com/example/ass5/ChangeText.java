package com.example.ass5;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class ChangeText extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override

        public void start(Stage stage) throws IOException {
    // Write a program that displays a text field and two buttons labeled “upper case” and “lower case, when the user clicks on the upper case button, the text changes to upper case; when the user clicks on the lower case button, the text changes to lower case

        HBox root = new HBox();


        TextField text = new TextField();
        root.getChildren().add(text);


        Button button = new Button("upper case");
        button.setOnAction(e -> {
            text.setText(text.getText().toUpperCase());
        });
        root.getChildren().add(button);
        Button button2 = new Button("lower case");
        button2.setOnAction(e -> {
            text.setText(text.getText().toLowerCase());
        });
        root.getChildren().add(button2);
        Pane pane = new Pane();
        pane.getChildren().add(root);
        Scene scene = new Scene(pane, 320, 240);

        stage.setTitle("Change Text");
        stage.setScene(scene);
        stage.show();



    }


}
