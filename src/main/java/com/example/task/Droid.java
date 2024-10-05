package com.example.task;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelReader;
import javafx.scene.paint.Color;

public class Droid {
    private ImageView imageView;
    private Image mazeImage;

    public Droid(Image mazeImage){
        this.mazeImage = mazeImage;
        Image robotImage = new Image(getClass().getResourceAsStream("/robot.png"));
        imageView=new ImageView(robotImage); //Create robot image view

        imageView.setX(15);
        imageView.setY(260);
    }

    //Gets the ImageView of the droid
    public ImageView getImageView() {
        return imageView;
    }

    //Moves the droid by the given deltas
    public void move(double dx, double dy) {
        double nextX = imageView.getX() + dx;
        double nextY=imageView.getY()+ dy;

        if (!isColliding(nextX, nextY)) {
            imageView.setX(nextX); // Update X position
            imageView.setY(nextY); // Update Y position
        }
    }

    //Checks if moving to (x, y) would collide with a wall
    private boolean isColliding(double x, double y) {
        PixelReader pixelReader = mazeImage.getPixelReader(); //Pixel reader will be checking colors

        double robotWidth = imageView.getImage().getWidth(); //Get dimensions of droid
        double robotHeight = imageView.getImage().getHeight();

        double inset = 2.0; //Slightly inset collision points, I had to try a few different sizes to make ihm fit

        double[][] collisionPoints = {//Defining the corners in a 2D array
                { x + inset, y + inset }, //Top left
                { x + robotWidth - inset, y + inset },//Top right
                { x + inset, y + robotHeight - inset }, //Bottom left
                { x + robotWidth - inset, y + robotHeight - inset} //Bottom right
        };

        for (double[] point : collisionPoints) { //Loop through each collision point to check bounds
            int checkX=(int) point[0];
            int checkY=(int) point[1];

            if (checkX < 0 || checkY < 0 || checkX >= mazeImage.getWidth() || checkY >= mazeImage.getHeight()) {
                return true; //Out of bounds
            }

            Color color = pixelReader.getColor(checkX, checkY);
            if (isWall(color)) { //Sends the color to the function checking for collision by pixel color
                return true; //Hit wall
            }
        }
        return false;
    }

    //Determines if the given color represents a wall
    private boolean isWall(Color color) {
        //Checks if the color is mostly blue with a range, so other blues would also function as a wall
        return color.getBlue() > 0.5 && color.getRed() < 0.5 && color.getGreen() < 0.5;
    }
}

