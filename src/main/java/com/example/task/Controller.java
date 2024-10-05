package com.example.task;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;

public class Controller {
    private BorderPane root;
    private StackPane mazePane;
    private Maze1 maze1;
    private Maze2 maze2;

    public Controller() {
        root = new BorderPane();

        mazePane=new StackPane();

        maze1 = new Maze1();
        maze2 = new Maze2();

        mazePane.getChildren().addAll(maze1, maze2);//Add both mazes to the pane

        maze1.setVisible(true); //Show maze1 at start
        maze2.setVisible(false); //Hide maze2 initially

        Button btnMaze1 = new Button("Maze 1"); //I had to use buttons instead of the tabs, as the arrow keys would
        Button btnMaze2 = new Button("Maze 2"); //just interact with the tabs, buttons ended up working much better

        btnMaze1.setOnAction(e -> switchMaze(1)); //Handle Maze 1 button click
        btnMaze2.setOnAction(e -> switchMaze(2)); //Handle Maze 2 button click

        HBox buttonBox = new HBox(10, btnMaze1, btnMaze2); //Buttons with spacing
        buttonBox.setAlignment(Pos.CENTER);

        root.setCenter(mazePane); //Set mazePane in center
        root.setBottom(buttonBox); //Set buttons at bottom
    }

    // Switch between mazes when a button is clicked
    private void switchMaze(int mazeNumber){
        if (mazeNumber == 1) {
            maze1.setVisible(true);
            maze1.requestFocus(); //Focus on maze1
            maze2.setVisible(false);
        } else if (mazeNumber == 2) {
            maze1.setVisible(false);
            maze2.setVisible(true);
            maze2.requestFocus(); //Focus on maze2
        }
    }

    // Get the root pane for the scene
    public BorderPane getRoot() {
        return root;
    }
}



