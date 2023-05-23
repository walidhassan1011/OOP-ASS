package com.example.ass4;

import javafx.application.Application;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class DisplayText extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws IOException {

        // display five texts vertically in grid pane

        GridPane pane = new GridPane();
        pane.setHgap(10);
        pane.setVgap(10);
        pane.setAlignment(javafx.geometry.Pos.CENTER);
        pane.setPadding(new javafx.geometry.Insets(10, 40, 10, 40));
        // create text object
        javafx.scene.text.Text text1 = new javafx.scene.text.Text("Java");
        text1.rotateProperty().set(90);

        text1.setFont(javafx.scene.text.Font.font("Times New Roman", javafx.scene.text.FontWeight.BOLD, 22));
        javafx.scene.text.Text text2 = new javafx.scene.text.Text("Java");
        text2.rotateProperty().set(90);
        text2.setFont(javafx.scene.text.Font.font("italic", javafx.scene.text.FontWeight.BOLD, 22));
        javafx.scene.text.Text text3 = new javafx.scene.text.Text("Java");
        text3.rotateProperty().set(90);
        text3.styleProperty().set("-fx-font-size: 22px;  ");
        javafx.scene.text.Text text4 = new javafx.scene.text.Text("Java");
        text4.rotateProperty().set(90);
        text4.styleProperty().set("-fx-font-size: 22px;  ");
        javafx.scene.text.Text text5 = new javafx.scene.text.Text("Java");
        text5.rotateProperty().set(90);
        text5.styleProperty().set("-fx-font-size: 22px;  ");
        // display text randomly in grid pane
        pane.add(text1, 0, 0);
        pane.add(text2, 1, 0);
        pane.add(text3, 2, 0);
        pane.add(text4, 3, 0);
        pane.add(text5, 4, 0);
        javafx.scene.Scene scene = new javafx.scene.Scene(pane);
        stage.setTitle("Display Text");
        stage.setScene(scene);
        stage.show();




    }
}
