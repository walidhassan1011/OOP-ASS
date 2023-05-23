package com.example.ass4;

import javafx.application.Application;

import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;


public class TicTac extends  Application{


        public static void main(String[] args) {
            launch();
        }

        @Override
        public void start (Stage stage) throws IOException {
            // display image randomly in grid pane

            GridPane pane = new GridPane();
            pane.setHgap(10);
            pane.setVgap(10);
            pane.setAlignment(javafx.geometry.Pos.CENTER);
            pane.setPadding(new javafx.geometry.Insets(10,40,10,40));
            // create image view object with image x.gif
            ImageView image1 = new ImageView(new Image(new FileInputStream("D:\\AAST\\semester 6\\oop\\ASS\\ASS4\\images\\x.gif")));
            ImageView image3 = new ImageView(new Image(new FileInputStream("D:\\AAST\\semester 6\\oop\\ASS\\ASS4\\images\\x.gif")));
            ImageView image5 = new ImageView(new Image(new FileInputStream("D:\\AAST\\semester 6\\oop\\ASS\\ASS4\\images\\x.gif")));
            ImageView image7 = new ImageView(new Image(new FileInputStream("D:\\AAST\\semester 6\\oop\\ASS\\ASS4\\images\\x.gif")));
            // create image view object with image o.gif
            ImageView image2 = new ImageView(new Image(new FileInputStream("D:\\AAST\\semester 6\\oop\\ASS\\ASS4\\images\\o.gif")));
            ImageView image4 = new ImageView(new Image(new FileInputStream("D:\\AAST\\semester 6\\oop\\ASS\\ASS4\\images\\o.gif")));
            ImageView image6 = new ImageView(new Image(new FileInputStream("D:\\AAST\\semester 6\\oop\\ASS\\ASS4\\images\\o.gif")));

            // display image randomly in grid pane

            pane.add(image2,0,0);
            pane.add(image1,1,0);
            pane.add(image4,2,0);
            pane.add(image3,0,1);
            pane.add(image5,2,1);
            pane.add(image7,0,2);










            Scene scene = new Scene(pane);
            stage.setTitle("Tic Tac Toe");
            stage.setScene(scene);
            stage.show();







        }


}
