package com.example.ass4;

import javafx.application.Application;

import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ImageDsiplay extends Application {
    public static void main(String[] args) {
        launch();
    }
    public void start(Stage stage) throws IOException {
            // dsiplay four images in grid pane
        GridPane pane =new GridPane();
        pane.setHgap(10);
        pane.setVgap(10);
       ImageView image1 = new ImageView(new Image(new FileInputStream("D:\\AAST\\semester 6\\oop\\ASS\\ASS4\\images\\ca.gif")));
       ImageView image2 = new ImageView(new Image(new FileInputStream("D:\\AAST\\semester 6\\oop\\ASS\\ASS4\\images\\china.gif")));
       ImageView image3 = new ImageView(new Image(new FileInputStream("D:\\AAST\\semester 6\\oop\\ASS\\ASS4\\images\\us.gif")));
       ImageView image4 = new ImageView(new Image(new FileInputStream("D:\\AAST\\semester 6\\oop\\ASS\\ASS4\\images\\uk.gif")));
            pane.add(image1,0,0);
            pane.add(image2,1,0);
            pane.add(image3,0,1);
            pane.add(image4,1,1);
        Scene scene= new Scene(pane);
        stage.setTitle("Image Dsiplay");
        stage.setScene(scene);
        stage.show();
    }





}
