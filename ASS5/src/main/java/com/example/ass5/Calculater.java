package com.example.ass5;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class Calculater extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override

        public void start(Stage stage) throws IOException {
        HBox root = new HBox();
        BorderPane pane = new BorderPane();

        root.getChildren().add(new Label("Number1"));
       TextField text1= new TextField();

       root.getChildren().add(text1);
        root.getChildren().add(new Label("Number2"));
        TextField text2= new TextField();
        root.getChildren().add(text2);
        root.getChildren().add(new Label("Result"));
        TextField text3= new TextField();
        root.getChildren().add(text3);
        pane.setCenter(root);

        HBox root2 = new HBox();
        Button button = new Button("Add");
        root2.getChildren().add(button);
        button.setOnAction((ActionEvent e) -> {
            double num1 = Double.parseDouble(text1.getText());
            double num2 = Double.parseDouble(text2.getText());
            double result = num1 + num2;
            text3.setText(result + "");
        });
        Button button2 = new Button("Sub");
        button2.setOnAction((ActionEvent e) -> {
            double num1 = Double.parseDouble(text1.getText());
            double num2 = Double.parseDouble(text2.getText());
            double result = num1 - num2;
            text3.setText(result + "");
        });
        root2.getChildren().add(button2);
        Button button3 = new Button("Mul");
        button3.setOnAction((ActionEvent e) -> {
            double num1 = Double.parseDouble(text1.getText());
            double num2 = Double.parseDouble(text2.getText());
            double result = num1 * num2;
            text3.setText(result + "");
        });
        root2.getChildren().add(button3);
        Button button4 = new Button("Div");
        button4.setOnAction((ActionEvent e) -> {

           try{
               double num1 = Double.parseDouble(text1.getText());
               double num2 = Double.parseDouble(text2.getText());
               double result = num1 / num2;
               text3.setText(result + "");
           }catch (Exception ex){
               Stage stage2 = new Stage();
               stage2.setTitle("Error");
               Pane pane2 = new Pane();
               pane2.setPadding(new javafx.geometry.Insets(10, 10, 10, 10));
               pane2.setPrefSize(200, 200);

                Button button5 = new Button("OK");
                pane2.getChildren().add(button5);
                button5.setLayoutX(80);
                button5.setLayoutY(80);
                button5.setOnAction((ActionEvent e2) -> {
                    stage2.close();
                });

                Scene scene2 = new Scene(pane2, 200, 200);
                stage2.setScene(scene2);
                stage2.show();

        }});
        root2.getChildren().add(button4);
        pane.setBottom(root2);
        Scene scene = new Scene(pane, 200, 200);
        stage.setTitle("Calculater");
        stage.setScene(scene);
        stage.show();
    }

}
