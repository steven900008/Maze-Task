package com.example.task;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        //Create a new instance of the Controller, which manages the maze and car
        Controller controller=new Controller();

        Scene scene = new Scene(controller.getRoot(), 625, 500); //Set scene size
        primaryStage.setScene(scene);
        primaryStage.setTitle("Maze Game - Move with arrow keys");
        primaryStage.show();
    }

    //Launches the application
    public static void main(String[] args) {
        launch(args);
    }
}

