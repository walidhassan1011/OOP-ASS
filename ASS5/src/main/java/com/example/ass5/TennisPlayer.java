package com.example.ass5;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TennisPlayer extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override

        public void start(Stage stage) throws IOException {
          Pane root = new Pane();


        File file = new File("D:\\AAST\\semester 6\\oop\\ASS\\ASS5\\src\\TennisData.txt");
        Scanner sc = new Scanner(file);
        List<Player> players = new ArrayList<>();
        while (sc.hasNextLine()) {
            String data = sc.nextLine();
            String[] arr = data.split("-");

     players.add(new Player(arr[0], arr[1], arr[2]));


        }
        TableView table = new TableView();
        table.setLayoutX(10);
        table.setLayoutY(10);
        table.setPrefSize(300, 200);
        root.getChildren().add(table);
        TableColumn<String, Player> column1 = new TableColumn<>("Name");
        column1.setCellValueFactory(new PropertyValueFactory<>("name"));
        TableColumn<String, Player> column2 = new TableColumn<>("Wins");
        column2.setCellValueFactory(new PropertyValueFactory<>("wins"));
        TableColumn<String, Player> column3 = new TableColumn<>("Losses");
        column3.setCellValueFactory(new PropertyValueFactory<>("losses"));
        table.getColumns().add(column1);
        table.getColumns().add(column2);
        table.getColumns().add(column3);
        ObservableList<Player> data = table.getItems();

        data.addAll(players);

        table.onMouseClickedProperty().set(e -> {
            Player player = (Player) table.getSelectionModel().getSelectedItem();
            System.out.println(player.getName());
        });

        for (int i = 0; i < players.size(); i++) {
            // display list of players
//            Label label1 = new Label(players.get(i).getName());
//            label1.setLayoutX(10);
//            label1.setLayoutY(30 + (i * 20));
//            root.getChildren().add(label1);
//            // display list of scores
//            Label label2 = new Label(players.get(i).wins + "");
//            label2.setLayoutX(100);
//            label2.setLayoutY(30 + (i * 20));
//            root.getChildren().add(label2);
//            // display list of losses
//            Label label3 = new Label(players.get(i).losses + "");
//            label3.setLayoutX(150);
//            label3.setLayoutY(30 + (i * 20));
//            root.getChildren().add(label3);
            // create table

            // convert int to string
            // add columns to table


            // add data to table rows












        }
        sc.close();
        stage.setTitle("Tennis Player");
        stage.setScene(new Scene(root, 320, 240));
        stage.show();


    }
    public class Player{
        private String name;
        private int score;
        private String wins;

        private String losses;



        public Player(String name, String wins, String losses){
            this.name = name;

            this.wins = wins;
            this.losses = losses;
        }
        public String getName(){
            return name;
        }
        public int getScore(){
            return score;
        }
        public void setName(String name){
            this.name = name;
        }
        public void setScore(int score){
            this.score = score;
        }
        public void incrementScore(){
            score++;
        }
        public String toString(){
            return name + " " + score;
        }
        public String getWins(){
            return wins;
        }
        public String getLosses(){
            return losses;
        }
    }
}
