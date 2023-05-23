package com.example.ass4;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Point2D;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CircleText extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // display welcome to java around circle
        Pane pane = new Pane();
        String[] java = "Welcome to Java".split("");
        Font font = Font.font("Times New Roman", FontWeight.EXTRA_BOLD, 30);

            pane.setPadding(new Insets(10, 10, 10, 10));


        Circle center = new Circle(200, 200, 100);
        center.setFill(Color.WHITE);
        center.setStroke(Color.WHITE);
        pane.getChildren().add(center);


        double angle = 0;

        double rotate = 90;
        for (int i = 0; i < java.length; i++) {
            angle += 21;
            rotate += 21;
            double x = center.getCenterX() + center.getRadius() * Math.cos(Math.toRadians(angle));
            double y = center.getCenterY() + center.getRadius() * Math.sin(Math.toRadians(angle));
            Text text = new Text(x, y,java[i]);
            text.setRotate(rotate);
            text.setFont(font);
            pane.getChildren().add(text);

        }

        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setTitle("Welcome to Java");
        primaryStage.setScene(scene);
        primaryStage.show();

}




}
