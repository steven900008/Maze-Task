package com.example.task;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;

public class Maze1 extends Pane {
    private ImageView mazeView;
    private Droid droid;
    private final int WIDTH = 625;
    private final int HEIGHT=450;

    public Maze1() {
        setPrefSize(WIDTH, HEIGHT); //Set pane size
        setup();
    }

    private void setup(){
        Image mazeImage = new Image(getClass().getResourceAsStream("/maze.png")); //Load maze from resources
        mazeView=new ImageView(mazeImage); //Use the created image view to display the maze

        droid=new Droid(mazeImage); //Create droid

        getChildren().addAll(mazeView, droid.getImageView()); //add maze and droid

        //this is required for managing the arrow key presses between panes, it needs to be "focused" to recieve inputs
        setFocusTraversable(true);
        setOnKeyPressed(this::handleKeyPress); //Event handler for key press events
    }

    //Handles the key presses to move the guy
    private void handleKeyPress(KeyEvent event) {
        switch (event.getCode()){
            case UP:
                droid.move(0.0, -5.0); //Move up
                break;
            case DOWN:
                droid.move(0.0, 5.0); //Move down
                break;
            case LEFT:
                droid.move(-5.0, 0.0); //Move left
                break;
            case RIGHT:
                droid.move(5.0, 0.0); //Move right
                break;
            default:
                break;
        }
        event.consume(); //This prevents the event from being handled by other event listeners further up the hierarchy

    }
}


