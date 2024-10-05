package com.example.task;

import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;

public class Maze2 extends Pane {
    private ImageView mazeView;
    private Car car;
    private final int WIDTH = 625;
    private final int HEIGHT=450;

    public Maze2() {
        setPrefSize(WIDTH, HEIGHT); //Set pane size
        setup();
    }

    private void setup(){
        Image mazeImage = new Image(getClass().getResourceAsStream("/maze2.png"));
        mazeView = new ImageView(mazeImage);

        car=new Car(mazeImage);//Create car

        car.setLayoutX(15); //Starting X position
        car.setLayoutY(25);  //Starting Y position

        Group mazeGroup = new Group(mazeView, car); //Group the objects

        double mazeWidth=mazeImage.getWidth();
        double mazeHeight=mazeImage.getHeight();
        double paneWidth=WIDTH;
        double paneHeight=HEIGHT;
        double mazeX=(paneWidth - mazeWidth) / 2; //Center X
        double mazeY=(paneHeight - mazeHeight) / 2; //Center Y
        mazeGroup.setLayoutX(mazeX);
        mazeGroup.setLayoutY(mazeY);

        getChildren().add(mazeGroup); //Add group to pane

        setFocusTraversable(true);//Allow key events
        setOnKeyPressed(this::handleKeyPress);
    }

    // Handles the key presses to move the car
    private void handleKeyPress(KeyEvent event){
        switch (event.getCode()) {
            case UP:
                car.move(0.0, -5.0, "vertical"); //Move up
                break;
            case DOWN:
                car.move(0.0, 5.0, "vertical"); //Move down
                break;
            case LEFT:
                car.move(-5.0, 0.0, "horizontal"); //Move left
                break;
            case RIGHT:
                car.move(5.0, 0.0, "horizontal"); //Move right
                break;
            default:
                break;
        }
        event.consume();
    }
}


