package com.example.task;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class CarDrawing {
    static public void main(String args[]) {
        try {
            int width = 25, height = 25;

            // TYPE_INT_ARGB specifies the image format: 8-bit RGBA packed
            // into integer pixels
            BufferedImage bi = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

            Graphics2D ig2 = bi.createGraphics();


            // Draw car body thingy
            ig2.setColor(Color.blue);
            ig2.fillRect(5, 10, 15, 5); // Main body of the car

            ig2.setColor(Color.red);
            ig2.fillRect(8, 6, 9, 4); // Car roof

            ig2.setColor(Color.black);
            ig2.fillOval(7, 15, 5, 4); // Left wheel
            ig2.fillOval(13, 15, 5, 4); // Right wheel

            ImageIO.write(bi, "PNG", new File("src/resources/car.png"));

        } catch (IOException ie) {
            ie.printStackTrace();
        }
    }
}
