package com.example.task;

import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.PixelReader;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class Car extends Group {
    private String orientation; //Stores the car's current orientation
    private Image mazeImage; //The image used for collision detection

    //Constructor that initializes the car and maze
    public Car(Image mazeImage) {
        this.mazeImage = mazeImage;
        this.orientation ="horizontal"; //Default orientation
        updateCarShape(); //Initialize car shape
    }

    //Moves the car by the given deltas (dx, dy) this tracks changes and is used to calc the next position
    public void move(double dx, double dy, String newOrientation) {
        double nextX = getLayoutX() + dx; //Calculate the next X position
        double nextY = getLayoutY() + dy; //Calculate the next Y position

        //Check if the next position results in a collision
        if (!isColliding(nextX, nextY, newOrientation)){
            setLayoutX(nextX); //Update the car's X position if no collision
            setLayoutY(nextY); //Update the car's Y position if no collision

            //Update the car's shape if the orientation changes
            if (!orientation.equals(newOrientation)) {
                orientation = newOrientation;
                updateCarShape(); //Redraw the car with the new orientation
            }
        }
    }

    //Updates the car's visual shape based on its current orientation
    private void updateCarShape() {
        getChildren().clear(); //Clear previous shapes from the group

        if (orientation.equals("horizontal")) {
            //Create a horizontal car with a red body and two black wheels
            Rectangle body = new Rectangle(0, 0, 40, 20); //Horizontal body
            body.setFill(Color.RED);

            Circle wheel1 = new Circle(10, 20, 5); //First wheel
            Circle wheel2 = new Circle(30, 20, 5); //Second wheel
            wheel1.setFill(Color.BLACK);
            wheel2.setFill(Color.BLACK);

            //Add the body and wheels to the group
            getChildren().addAll(body, wheel1, wheel2);
        } else {
            //Create a vertical car with a red body and four black wheels
            Rectangle body = new Rectangle(0, 0, 20, 40); //Vertical body
            body.setFill(Color.RED);

            Circle wheel1 = new Circle(0, 10, 3);  //First wheel (top-left)
            Circle wheel2 = new Circle(0, 30, 3);  //Second wheel (bottom-left)
            Circle wheel3 = new Circle(20, 10, 3); //Third wheel (top-right)
            Circle wheel4 = new Circle(20, 30, 3); //Fourth wheel (bottom-right)
            wheel1.setFill(Color.BLACK);
            wheel2.setFill(Color.BLACK);
            wheel3.setFill(Color.BLACK);
            wheel4.setFill(Color.BLACK);

            //Add the body and wheels to the group
            getChildren().addAll(body, wheel1, wheel2, wheel3, wheel4);
        }
    }

    //Checks if moving to the next position with the given orientation would collide with a wall
    private boolean isColliding(double x, double y, String orientation) {
        PixelReader pixelReader = mazeImage.getPixelReader(); //Reads the pixel colors from the maze image

        //Set the width and height based on the car's orientation
        int width = orientation.equals("horizontal") ? 40 : 20;
        int height = orientation.equals("horizontal") ? 20 : 40;

        //check corners of the car
        int[] offsetX = {0, width};
        int[] offsetY = {0, height};

        //Loop through each corner of the car to check for collisions
        for (int dx : offsetX) {
            for (int dy : offsetY) {
                int checkX = (int) (x + dx); //X position to check
                int checkY = (int) (y + dy); //Y position to check

                //Check if the position is out of bounds of the maze image
                if (checkX < 0 || checkY < 0 || checkX >= mazeImage.getWidth() || checkY >= mazeImage.getHeight()) {
                    return true; //Return true if out of bounds
                }

                //Check the color of the pixel at the current position
                Color color = pixelReader.getColor(checkX, checkY);
                if (isWall(color)) {
                    return true; //Return true if the pixel represents a wall
                }
            }
        }
        return false; //No collision detected
    }

    //Determines if a given color represents a wall in the maze
    private boolean isWall(Color color) {
        //Checks if the color is primarily blue, this allows for other mazes to be used even if its not the exact blue
        return color.getBlue() > 0.5 && color.getRed() < 0.5 && color.getGreen() < 0.5;
    }
}
