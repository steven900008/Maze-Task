package com.example.task;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.ArrayList;


public class Main extends Application {




    @Override
    public void start(Stage primaryStage) {

        Image mazeImage = new Image(getClass().getResource("/maze.png").toExternalForm());
        ImageView mazeView = new ImageView(mazeImage);

        Image mazeImage2 = new Image(getClass().getResource("/maze2.png").toExternalForm());
        ImageView mazeView2 = new ImageView(mazeImage2);

//This initializes the droid bot
        Robot robot = new Robot();
        Car car = new Car();
        ArrayList<double[]> positions = new ArrayList<>();

        ArrayList<double[]> positions2 = new ArrayList<>();
        //These are all the positions the bot needs to reach before completing that maze thing
        positions.add(new double[]{50.0, 55.0});
        positions.add(new double[]{50.0, 60.0});
        positions.add(new double[]{50.0, 65.0});
        positions.add(new double[]{50.0, 70.0});
        positions.add(new double[]{50.0, 75.0});
        positions.add(new double[]{50.0, 80.0});
        positions.add(new double[]{50.0, 85.0});
        positions.add(new double[]{50.0, 90.0});
        positions.add(new double[]{50.0, 95.0});
        positions.add(new double[]{50.0, 100.0});
        positions.add(new double[]{50.0, 105.0});
        positions.add(new double[]{50.0, 110.0});
        positions.add(new double[]{50.0, 115.0});
        positions.add(new double[]{50.0, 120.0});
        positions.add(new double[]{50.0, 125.0});
        positions.add(new double[]{50.0, 130.0});
        positions.add(new double[]{50.0, 135.0});
        positions.add(new double[]{50.0, 140.0});
        positions.add(new double[]{50.0, 145.0});
        positions.add(new double[]{50.0, 150.0});
        positions.add(new double[]{55.0, 150.0});
        positions.add(new double[]{60.0, 150.0});
        positions.add(new double[]{65.0, 150.0});
        positions.add(new double[]{70.0, 150.0});
        positions.add(new double[]{75.0, 150.0});
        positions.add(new double[]{80.0, 150.0});
        positions.add(new double[]{85.0, 150.0});
        positions.add(new double[]{90.0, 150.0});
        positions.add(new double[]{95.0, 150.0});
        positions.add(new double[]{100.0, 150.0});
        positions.add(new double[]{105.0, 150.0});
        positions.add(new double[]{110.0, 150.0});
        positions.add(new double[]{115.0, 150.0});
        positions.add(new double[]{120.0, 150.0});
        positions.add(new double[]{125.0, 150.0});
        positions.add(new double[]{130.0, 150.0});
        positions.add(new double[]{135.0, 150.0});
        positions.add(new double[]{140.0, 150.0});
        positions.add(new double[]{145.0, 150.0});
        positions.add(new double[]{150.0, 150.0});
        positions.add(new double[]{155.0, 150.0});
        positions.add(new double[]{160.0, 150.0});
        positions.add(new double[]{165.0, 150.0});
        positions.add(new double[]{170.0, 150.0});
        positions.add(new double[]{175.0, 150.0});
        positions.add(new double[]{180.0, 150.0});
        positions.add(new double[]{185.0, 150.0});
        positions.add(new double[]{190.0, 150.0});
        positions.add(new double[]{195.0, 150.0});
        positions.add(new double[]{200.0, 150.0});
        positions.add(new double[]{205.0, 150.0});
        positions.add(new double[]{210.0, 150.0});
        positions.add(new double[]{215.0, 150.0});
        positions.add(new double[]{220.0, 150.0});
        positions.add(new double[]{225.0, 150.0});
        positions.add(new double[]{230.0, 150.0});
        positions.add(new double[]{235.0, 150.0});
        positions.add(new double[]{240.0, 150.0});
        positions.add(new double[]{245.0, 150.0});
        positions.add(new double[]{250.0, 150.0});
        positions.add(new double[]{255.0, 150.0});
        positions.add(new double[]{260.0, 150.0});
        positions.add(new double[]{265.0, 150.0});
        positions.add(new double[]{270.0, 150.0});
        positions.add(new double[]{270.0, 145.0});
        positions.add(new double[]{270.0, 140.0});
        positions.add(new double[]{270.0, 135.0});
        positions.add(new double[]{270.0, 130.0});
        positions.add(new double[]{270.0, 125.0});
        positions.add(new double[]{270.0, 120.0});
        positions.add(new double[]{270.0, 115.0});
        positions.add(new double[]{270.0, 110.0});
        positions.add(new double[]{270.0, 105.0});
        positions.add(new double[]{270.0, 100.0});
        positions.add(new double[]{270.0, 95.0});
        positions.add(new double[]{275.0, 95.0});
        positions.add(new double[]{280.0, 95.0});
        positions.add(new double[]{285.0, 95.0});
        positions.add(new double[]{290.0, 95.0});
        positions.add(new double[]{295.0, 95.0});
        positions.add(new double[]{300.0, 95.0});
        positions.add(new double[]{305.0, 95.0});
        positions.add(new double[]{310.0, 95.0});
        positions.add(new double[]{315.0, 95.0});
        positions.add(new double[]{320.0, 95.0});
        positions.add(new double[]{320.0, 100.0});
        positions.add(new double[]{320.0, 105.0});
        positions.add(new double[]{320.0, 110.0});
        positions.add(new double[]{320.0, 115.0});
        positions.add(new double[]{320.0, 120.0});
        positions.add(new double[]{320.0, 125.0});
        positions.add(new double[]{320.0, 130.0});
        positions.add(new double[]{320.0, 135.0});
        positions.add(new double[]{320.0, 140.0});
        positions.add(new double[]{320.0, 145.0});
        positions.add(new double[]{320.0, 150.0});
        positions.add(new double[]{320.0, 155.0});
        positions.add(new double[]{320.0, 160.0});
        positions.add(new double[]{320.0, 165.0});
        positions.add(new double[]{320.0, 170.0});
        positions.add(new double[]{320.0, 175.0});
        positions.add(new double[]{320.0, 180.0});
        positions.add(new double[]{320.0, 185.0});
        positions.add(new double[]{320.0, 190.0});
        positions.add(new double[]{320.0, 195.0});
        positions.add(new double[]{320.0, 200.0});
        positions.add(new double[]{320.0, 205.0});
        positions.add(new double[]{320.0, 210.0});
        positions.add(new double[]{320.0, 215.0});
        positions.add(new double[]{320.0, 220.0});
        positions.add(new double[]{320.0, 225.0});
        positions.add(new double[]{320.0, 230.0});
        positions.add(new double[]{320.0, 235.0});
        positions.add(new double[]{320.0, 240.0});
        positions.add(new double[]{320.0, 245.0});
        positions.add(new double[]{320.0, 250.0});
        positions.add(new double[]{320.0, 255.0});
        positions.add(new double[]{320.0, 260.0});
        positions.add(new double[]{320.0, 265.0});
        positions.add(new double[]{320.0, 270.0});
        positions.add(new double[]{320.0, 275.0});
        positions.add(new double[]{320.0, 280.0});
        positions.add(new double[]{320.0, 285.0});
        positions.add(new double[]{320.0, 290.0});
        positions.add(new double[]{320.0, 295.0});
        positions.add(new double[]{320.0, 300.0});
        positions.add(new double[]{320.0, 305.0});
        positions.add(new double[]{320.0, 310.0});
        positions.add(new double[]{320.0, 315.0});
        positions.add(new double[]{320.0, 320.0});
        positions.add(new double[]{320.0, 325.0});
        positions.add(new double[]{325.0, 325.0});
        positions.add(new double[]{330.0, 325.0});
        positions.add(new double[]{335.0, 325.0});
        positions.add(new double[]{340.0, 325.0});
        positions.add(new double[]{345.0, 325.0});
        positions.add(new double[]{350.0, 325.0});
        positions.add(new double[]{355.0, 325.0});
        positions.add(new double[]{360.0, 325.0});
        positions.add(new double[]{365.0, 325.0});
        positions.add(new double[]{370.0, 325.0});
        positions.add(new double[]{375.0, 325.0});
        positions.add(new double[]{380.0, 325.0});
        positions.add(new double[]{385.0, 325.0});
        positions.add(new double[]{385.0, 315.0});
        positions.add(new double[]{385.0, 310.0});
        positions.add(new double[]{385.0, 305.0});
        positions.add(new double[]{385.0, 300.0});
        positions.add(new double[]{385.0, 295.0});
        positions.add(new double[]{385.0, 290.0});
        positions.add(new double[]{385.0, 285.0});
        positions.add(new double[]{385.0, 280.0});
        positions.add(new double[]{385.0, 275.0});
        positions.add(new double[]{385.0, 270.0});
        positions.add(new double[]{385.0, 265.0});
        positions.add(new double[]{385.0, 260.0});
        positions.add(new double[]{385.0, 255.0});
        positions.add(new double[]{385.0, 250.0});
        positions.add(new double[]{385.0, 245.0});
        positions.add(new double[]{385.0, 240.0});
        positions.add(new double[]{385.0, 235.0});
        positions.add(new double[]{385.0, 230.0});
        positions.add(new double[]{385.0, 225.0});
        positions.add(new double[]{385.0, 220.0});
        positions.add(new double[]{385.0, 215.0});
        positions.add(new double[]{385.0, 210.0});
        positions.add(new double[]{385.0, 205.0});
        positions.add(new double[]{390.0, 205.0});
        positions.add(new double[]{395.0, 205.0});
        positions.add(new double[]{400.0, 205.0});
        positions.add(new double[]{405.0, 205.0});
        positions.add(new double[]{410.0, 205.0});
        positions.add(new double[]{415.0, 205.0});
        positions.add(new double[]{420.0, 205.0});
        positions.add(new double[]{425.0, 205.0});
        positions.add(new double[]{430.0, 205.0});
        positions.add(new double[]{435.0, 205.0});
        positions.add(new double[]{440.0, 205.0});
        positions.add(new double[]{445.0, 205.0});
        positions.add(new double[]{450.0, 205.0});
        positions.add(new double[]{455.0, 205.0});
        positions.add(new double[]{460.0, 205.0});
        positions.add(new double[]{465.0, 205.0});
        positions.add(new double[]{470.0, 205.0});
        positions.add(new double[]{475.0, 205.0});
        positions.add(new double[]{480.0, 205.0});
        positions.add(new double[]{485.0, 205.0});
        positions.add(new double[]{490.0, 205.0});
        positions.add(new double[]{495.0, 205.0});
        positions.add(new double[]{500.0, 205.0});
        positions.add(new double[]{505.0, 205.0});
        positions.add(new double[]{505.0, 200.0});
        positions.add(new double[]{505.0, 195.0});
        positions.add(new double[]{505.0, 190.0});
        positions.add(new double[]{505.0, 185.0});
        positions.add(new double[]{505.0, 180.0});
        positions.add(new double[]{505.0, 175.0});
        positions.add(new double[]{505.0, 170.0});
        positions.add(new double[]{505.0, 165.0});
        positions.add(new double[]{505.0, 160.0});
        positions.add(new double[]{505.0, 155.0});
        positions.add(new double[]{505.0, 150.0});
        positions.add(new double[]{505.0, 145.0});
        positions.add(new double[]{505.0, 140.0});
        positions.add(new double[]{505.0, 135.0});
        positions.add(new double[]{505.0, 130.0});
        positions.add(new double[]{505.0, 125.0});
        positions.add(new double[]{505.0, 120.0});
        positions.add(new double[]{505.0, 115.0});
        positions.add(new double[]{505.0, 110.0});
        positions.add(new double[]{505.0, 105.0});
        positions.add(new double[]{505.0, 100.0});
        positions.add(new double[]{510.0, 100.0});
        positions.add(new double[]{515.0, 100.0});
        positions.add(new double[]{520.0, 100.0});
        positions.add(new double[]{525.0, 100.0});
        positions.add(new double[]{530.0, 100.0});
        positions.add(new double[]{535.0, 100.0});
        positions.add(new double[]{540.0, 100.0});
        positions.add(new double[]{545.0, 100.0});
        positions.add(new double[]{550.0, 100.0});
        positions.add(new double[]{555.0, 100.0});
        positions.add(new double[]{555.0, 105.0});
        positions.add(new double[]{555.0, 110.0});
        positions.add(new double[]{555.0, 115.0});
        positions.add(new double[]{555.0, 120.0});
        positions.add(new double[]{555.0, 125.0});
        positions.add(new double[]{555.0, 130.0});
        positions.add(new double[]{555.0, 135.0});
        positions.add(new double[]{555.0, 140.0});
        positions.add(new double[]{555.0, 145.0});
        positions.add(new double[]{555.0, 150.0});
        positions.add(new double[]{555.0, 155.0});
        positions.add(new double[]{555.0, 160.0});
        positions.add(new double[]{555.0, 165.0});
        positions.add(new double[]{555.0, 170.0});
        positions.add(new double[]{555.0, 175.0});
        positions.add(new double[]{555.0, 180.0});
        positions.add(new double[]{555.0, 185.0});
        positions.add(new double[]{555.0, 190.0});
        positions.add(new double[]{555.0, 195.0});
        positions.add(new double[]{555.0, 200.0});
        positions.add(new double[]{555.0, 205.0});
        positions.add(new double[]{555.0, 210.0});
        positions.add(new double[]{555.0, 215.0});
        positions.add(new double[]{555.0, 220.0});
        positions.add(new double[]{555.0, 225.0});
        positions.add(new double[]{555.0, 230.0});
        positions.add(new double[]{555.0, 235.0});
        positions.add(new double[]{555.0, 240.0});
        positions.add(new double[]{555.0, 245.0});
        positions.add(new double[]{560.0, 245.0});
        positions.add(new double[]{565.0, 245.0});
        positions.add(new double[]{570.0, 245.0});
        positions.add(new double[]{575.0, 245.0});
        positions.add(new double[]{580.0, 245.0});
        positions.add(new double[]{585.0, 245.0});
        positions.add(new double[]{590.0, 245.0});
        positions.add(new double[]{590.0, 245.0});




        positions2.add(new double[]{50.0, 55.0});
        positions2.add(new double[]{50.0, 60.0});
        positions2.add(new double[]{50.0, 65.0});
        positions2.add(new double[]{50.0, 70.0});
        positions2.add(new double[]{50.0, 75.0});
        positions2.add(new double[]{50.0, 80.0});
        positions2.add(new double[]{50.0, 85.0});
        positions2.add(new double[]{50.0, 90.0});
        positions2.add(new double[]{50.0, 95.0});
        positions2.add(new double[]{50.0, 100.0});
        positions2.add(new double[]{50.0, 105.0});
        positions2.add(new double[]{50.0, 110.0});
        positions2.add(new double[]{50.0, 115.0});
        positions2.add(new double[]{50.0, 120.0});
        positions2.add(new double[]{50.0, 125.0});
        positions2.add(new double[]{50.0, 130.0});
        positions2.add(new double[]{50.0, 135.0});
        positions2.add(new double[]{50.0, 140.0});
        positions2.add(new double[]{50.0, 145.0});
        positions2.add(new double[]{50.0, 150.0});
        positions2.add(new double[]{50.0, 155.0});
        positions2.add(new double[]{50.0, 160.0});
        positions2.add(new double[]{50.0, 165.0});
        positions2.add(new double[]{50.0, 170.0});
        positions2.add(new double[]{50.0, 175.0});
        positions2.add(new double[]{50.0, 180.0});
        positions2.add(new double[]{50.0, 185.0});
        positions2.add(new double[]{50.0, 190.0});
        positions2.add(new double[]{50.0, 195.0});
        positions2.add(new double[]{50.0, 200.0});
        positions2.add(new double[]{50.0, 205.0});
        positions2.add(new double[]{50.0, 210.0});
        positions2.add(new double[]{50.0, 215.0});
        positions2.add(new double[]{50.0, 220.0});
        positions2.add(new double[]{50.0, 225.0});
        positions2.add(new double[]{50.0, 230.0});
        positions2.add(new double[]{50.0, 235.0});
        positions2.add(new double[]{50.0, 240.0});
        positions2.add(new double[]{50.0, 245.0});
        positions2.add(new double[]{50.0, 250.0});
        positions2.add(new double[]{50.0, 255.0});
        positions2.add(new double[]{50.0, 260.0});
        positions2.add(new double[]{50.0, 265.0});
        positions2.add(new double[]{50.0, 270.0});
        positions2.add(new double[]{50.0, 275.0});
        positions2.add(new double[]{50.0, 280.0});
        positions2.add(new double[]{50.0, 285.0});
        positions2.add(new double[]{50.0, 290.0});
        positions2.add(new double[]{55.0, 290.0});
        positions2.add(new double[]{60.0, 290.0});
        positions2.add(new double[]{65.0, 290.0});
        positions2.add(new double[]{70.0, 290.0});
        positions2.add(new double[]{75.0, 290.0});
        positions2.add(new double[]{80.0, 290.0});
        positions2.add(new double[]{85.0, 290.0});
        positions2.add(new double[]{90.0, 290.0});
        positions2.add(new double[]{95.0, 290.0});
        positions2.add(new double[]{100.0, 290.0});
        positions2.add(new double[]{105.0, 290.0});
        positions2.add(new double[]{110.0, 290.0});
        positions2.add(new double[]{115.0, 290.0});
        positions2.add(new double[]{120.0, 290.0});
        positions2.add(new double[]{125.0, 290.0});
        positions2.add(new double[]{130.0, 290.0});
        positions2.add(new double[]{135.0, 290.0});
        positions2.add(new double[]{140.0, 290.0});
        positions2.add(new double[]{145.0, 290.0});
        positions2.add(new double[]{150.0, 290.0});
        positions2.add(new double[]{155.0, 290.0});
        positions2.add(new double[]{160.0, 290.0});
        positions2.add(new double[]{165.0, 290.0});
        positions2.add(new double[]{170.0, 290.0});
        positions2.add(new double[]{175.0, 290.0});
        positions2.add(new double[]{180.0, 290.0});
        positions2.add(new double[]{185.0, 290.0});
        positions2.add(new double[]{190.0, 290.0});
        positions2.add(new double[]{190.0, 285.0});
        positions2.add(new double[]{190.0, 280.0});
        positions2.add(new double[]{190.0, 275.0});
        positions2.add(new double[]{190.0, 270.0});
        positions2.add(new double[]{190.0, 265.0});
        positions2.add(new double[]{190.0, 260.0});
        positions2.add(new double[]{190.0, 255.0});
        positions2.add(new double[]{190.0, 250.0});
        positions2.add(new double[]{190.0, 245.0});
        positions2.add(new double[]{190.0, 240.0});
        positions2.add(new double[]{190.0, 235.0});
        positions2.add(new double[]{190.0, 230.0});
        positions2.add(new double[]{190.0, 225.0});
        positions2.add(new double[]{190.0, 220.0});
        positions2.add(new double[]{190.0, 215.0});
        positions2.add(new double[]{190.0, 210.0});
        positions2.add(new double[]{190.0, 205.0});
        positions2.add(new double[]{190.0, 200.0});
        positions2.add(new double[]{190.0, 195.0});
        positions2.add(new double[]{190.0, 190.0});
        positions2.add(new double[]{190.0, 185.0});
        positions2.add(new double[]{190.0, 180.0});
        positions2.add(new double[]{190.0, 175.0});
        positions2.add(new double[]{190.0, 170.0});
        positions2.add(new double[]{195.0, 170.0});
        positions2.add(new double[]{200.0, 170.0});
        positions2.add(new double[]{205.0, 170.0});
        positions2.add(new double[]{210.0, 170.0});
        positions2.add(new double[]{215.0, 170.0});
        positions2.add(new double[]{220.0, 170.0});
        positions2.add(new double[]{225.0, 170.0});
        positions2.add(new double[]{230.0, 170.0});
        positions2.add(new double[]{235.0, 170.0});
        positions2.add(new double[]{240.0, 170.0});
        positions2.add(new double[]{245.0, 170.0});
        positions2.add(new double[]{250.0, 170.0});
        positions2.add(new double[]{255.0, 170.0});
        positions2.add(new double[]{260.0, 170.0});
        positions2.add(new double[]{265.0, 170.0});
        positions2.add(new double[]{270.0, 170.0});
        positions2.add(new double[]{275.0, 170.0});
        positions2.add(new double[]{280.0, 170.0});
        positions2.add(new double[]{285.0, 170.0});
        positions2.add(new double[]{290.0, 170.0});
        positions2.add(new double[]{295.0, 170.0});
        positions2.add(new double[]{300.0, 170.0});
        positions2.add(new double[]{305.0, 170.0});
        positions2.add(new double[]{305.0, 165.0});
        positions2.add(new double[]{305.0, 160.0});
        positions2.add(new double[]{305.0, 155.0});
        positions2.add(new double[]{305.0, 150.0});
        positions2.add(new double[]{305.0, 145.0});
        positions2.add(new double[]{305.0, 140.0});
        positions2.add(new double[]{305.0, 135.0});
        positions2.add(new double[]{305.0, 130.0});
        positions2.add(new double[]{305.0, 125.0});
        positions2.add(new double[]{305.0, 120.0});
        positions2.add(new double[]{305.0, 115.0});
        positions2.add(new double[]{305.0, 110.0});
        positions2.add(new double[]{305.0, 105.0});
        positions2.add(new double[]{305.0, 100.0});
        positions2.add(new double[]{305.0, 95.0});
        positions2.add(new double[]{305.0, 90.0});
        positions2.add(new double[]{305.0, 85.0});
        positions2.add(new double[]{305.0, 80.0});
        positions2.add(new double[]{305.0, 75.0});
        positions2.add(new double[]{305.0, 70.0});
        positions2.add(new double[]{305.0, 65.0});
        positions2.add(new double[]{305.0, 60.0});
        positions2.add(new double[]{305.0, 55.0});
        positions2.add(new double[]{305.0, 50.0});
        positions2.add(new double[]{305.0, 45.0});
        positions2.add(new double[]{305.0, 40.0});
        positions2.add(new double[]{305.0, 35.0});
        positions2.add(new double[]{305.0, 30.0});
        positions2.add(new double[]{305.0, 25.0});
        positions2.add(new double[]{310.0, 25.0});
        positions2.add(new double[]{315.0, 25.0});
        positions2.add(new double[]{320.0, 25.0});
        positions2.add(new double[]{325.0, 25.0});
        positions2.add(new double[]{330.0, 25.0});
        positions2.add(new double[]{335.0, 25.0});
        positions2.add(new double[]{340.0, 25.0});
        positions2.add(new double[]{345.0, 25.0});
        positions2.add(new double[]{350.0, 25.0});
        positions2.add(new double[]{355.0, 25.0});
        positions2.add(new double[]{360.0, 25.0});
        positions2.add(new double[]{365.0, 25.0});
        positions2.add(new double[]{370.0, 25.0});
        positions2.add(new double[]{375.0, 25.0});
        positions2.add(new double[]{380.0, 25.0});
        positions2.add(new double[]{385.0, 25.0});
        positions2.add(new double[]{390.0, 25.0});
        positions2.add(new double[]{395.0, 25.0});
        positions2.add(new double[]{400.0, 25.0});
        positions2.add(new double[]{405.0, 25.0});
        positions2.add(new double[]{410.0, 25.0});
        positions2.add(new double[]{415.0, 25.0});
        positions2.add(new double[]{420.0, 25.0});
        positions2.add(new double[]{420.0, 30.0});
        positions2.add(new double[]{420.0, 35.0});
        positions2.add(new double[]{420.0, 40.0});
        positions2.add(new double[]{420.0, 45.0});
        positions2.add(new double[]{420.0, 50.0});
        positions2.add(new double[]{420.0, 55.0});
        positions2.add(new double[]{420.0, 60.0});
        positions2.add(new double[]{420.0, 65.0});
        positions2.add(new double[]{420.0, 70.0});
        positions2.add(new double[]{420.0, 75.0});
        positions2.add(new double[]{420.0, 80.0});
        positions2.add(new double[]{420.0, 85.0});
        positions2.add(new double[]{420.0, 90.0});
        positions2.add(new double[]{420.0, 95.0});
        positions2.add(new double[]{420.0, 100.0});
        positions2.add(new double[]{420.0, 105.0});
        positions2.add(new double[]{420.0, 110.0});
        positions2.add(new double[]{420.0, 115.0});
        positions2.add(new double[]{420.0, 120.0});
        positions2.add(new double[]{420.0, 125.0});
        positions2.add(new double[]{420.0, 130.0});
        positions2.add(new double[]{420.0, 135.0});
        positions2.add(new double[]{420.0, 140.0});
        positions2.add(new double[]{420.0, 145.0});
        positions2.add(new double[]{420.0, 150.0});
        positions2.add(new double[]{420.0, 155.0});
        positions2.add(new double[]{420.0, 160.0});
        positions2.add(new double[]{420.0, 165.0});
        positions2.add(new double[]{420.0, 170.0});
        positions2.add(new double[]{420.0, 175.0});
        positions2.add(new double[]{420.0, 180.0});
        positions2.add(new double[]{420.0, 185.0});
        positions2.add(new double[]{420.0, 190.0});
        positions2.add(new double[]{420.0, 195.0});
        positions2.add(new double[]{420.0, 200.0});
        positions2.add(new double[]{420.0, 205.0});
        positions2.add(new double[]{420.0, 210.0});
        positions2.add(new double[]{420.0, 215.0});
        positions2.add(new double[]{420.0, 220.0});
        positions2.add(new double[]{420.0, 225.0});
        positions2.add(new double[]{420.0, 230.0});
        positions2.add(new double[]{420.0, 235.0});
        positions2.add(new double[]{420.0, 240.0});
        positions2.add(new double[]{420.0, 245.0});
        positions2.add(new double[]{420.0, 250.0});
        positions2.add(new double[]{420.0, 255.0});
        positions2.add(new double[]{420.0, 260.0});
        positions2.add(new double[]{420.0, 265.0});
        positions2.add(new double[]{420.0, 270.0});
        positions2.add(new double[]{420.0, 275.0});
        positions2.add(new double[]{420.0, 280.0});
        positions2.add(new double[]{420.0, 285.0});
        positions2.add(new double[]{420.0, 290.0});
        positions2.add(new double[]{420.0, 295.0});
        positions2.add(new double[]{420.0, 295.0});
        positions2.add(new double[]{420.0, 295.0});
        positions2.add(new double[]{420.0, 295.0});
        positions2.add(new double[]{420.0, 295.0});
        positions2.add(new double[]{420.0, 295.0});








        // Just Sets up the scene and the stage
        Timeline timeline = new Timeline();


        Button startButton = new Button("Robot Animation");

        Button startmanualButton = new Button("Robot (Manual)");

        Button startButtonCar = new Button("Car Animation");

        Button startmanualButtonCar = new Button("Car (Manual)");

   Button startButton2 = new Button("Robot Animation");

        Button startmanualButton2 = new Button("Robot (Manual)");

        Button startButtonCar2 = new Button("Car Animation");

        Button startmanualButtonCar2 = new Button("Car (Manual)");




        startmanualButton.setOnAction(e->{
            Pane mazeLayout = new Pane();
            mazeLayout.getChildren().addAll(mazeView, robot.getRobotImageView());

            Scene mazeScene = new Scene(mazeLayout, mazeImage.getWidth(), mazeImage.getHeight());
            mazeScene.setOnKeyPressed(event -> robot.handleMovement(event, mazeImage));
            timeline.play(); // Start the timeline when switching to the maze scene
            primaryStage.setScene(mazeScene); // Switch to the maze scene

        });

        startButton.setOnAction(e -> {
            Pane mazeLayout = new Pane();
            mazeLayout.getChildren().addAll(mazeView, robot.getRobotImageView());

            Scene mazeScene = new Scene(mazeLayout, mazeImage.getWidth(), mazeImage.getHeight());

            int delay = 0;

            for (double[] position : positions) {
                KeyFrame keyFrame = new KeyFrame(Duration.millis(delay), event -> {
                    robot.getRobotImageView().setX(position[0]);
                    robot.getRobotImageView().setY(position[1]);
                });
                timeline.getKeyFrames().add(keyFrame);
                delay += 500; //Also added a    Delay of 500 milliseconds between moves
            }
            mazeScene.setOnKeyPressed(event -> robot.handleMovement(event, mazeImage));
            timeline.play(); // Start the timeline when switching to the maze scene
            primaryStage.setScene(mazeScene); // Switch to the maze scene



        });
        startButtonCar.setOnAction(e -> {
            Pane mazeLayout = new Pane();
            mazeLayout.getChildren().addAll(mazeView, car.getcarImageView());

            Scene mazeScene = new Scene(mazeLayout, mazeImage.getWidth(), mazeImage.getHeight());

            int delay = 0;

            for (int i = 0; i < positions.size(); i++) {
                final int index = i;
                KeyFrame keyFrame = new KeyFrame(Duration.millis(delay), event -> {
                    // Get the current and next position
                    double[] currentPosition = positions.get(index);
                    double[] nextPosition = (index + 1 < positions.size()) ? positions.get(index + 1) : currentPosition;

                    // Update the car's position
                    car.getcarImageView().setX(currentPosition[0]);
                    car.getcarImageView().setY(currentPosition[1]);

                    // Determine the direction based on movement
                    if (nextPosition[0] > currentPosition[0]) {
                        // Moving right
                        car.getcarImageView().setRotate(0);
                    } else if (nextPosition[0] < currentPosition[0]) {
                        // Moving left
                        car.getcarImageView().setRotate(0);

                    } else if (nextPosition[1] > currentPosition[1]) {
                        // Moving down
                        car.getcarImageView().setRotate(90);


                    } else if (nextPosition[1] < currentPosition[1]) {
                        // Moving up
                        car.getcarImageView().setRotate(270);
                    }
                });
                timeline.getKeyFrames().add(keyFrame);
                delay += 500; // Added a delay of 500 milliseconds between moves
            }

            timeline.play(); // Start the timeline when switching to the maze scene
            primaryStage.setScene(mazeScene); // Switch to the maze scene
        });

        startmanualButtonCar.setOnAction(e -> {
            Pane mazeLayout = new Pane();
            mazeLayout.getChildren().addAll(mazeView, car.getcarImageView());

            Scene mazeScene = new Scene(mazeLayout, mazeImage.getWidth(), mazeImage.getHeight());
            mazeScene.setOnKeyPressed(event -> car.handleMovement(event, mazeImage));
            timeline.play(); // Start the timeline when switching to the maze scene
            primaryStage.setScene(mazeScene); // Switch to the maze scene

        });

        startmanualButton2.setOnAction(e->{
            Pane mazeLayout = new Pane();
            mazeLayout.getChildren().addAll(mazeView2, robot.getRobotImageView());

            Scene mazeScene = new Scene(mazeLayout, mazeImage2.getWidth(), mazeImage2.getHeight());
            mazeScene.setOnKeyPressed(event -> robot.handleMovement(event, mazeImage2));
            timeline.play(); // Start the timeline when switching to the maze scene
            primaryStage.setScene(mazeScene); // Switch to the maze scene

        });

        startButton2.setOnAction(e -> {
            Pane mazeLayout = new Pane();
            mazeLayout.getChildren().addAll(mazeView2, robot.getRobotImageView());

            Scene mazeScene = new Scene(mazeLayout, mazeImage2.getWidth(), mazeImage2.getHeight());

            int delay = 0;

            for (double[] position : positions2) {
                KeyFrame keyFrame = new KeyFrame(Duration.millis(delay), event -> {
                    robot.getRobotImageView().setX(position[0]);
                    robot.getRobotImageView().setY(position[1]);
                });
                timeline.getKeyFrames().add(keyFrame);
                delay += 500; //Also added a    Delay of 500 milliseconds between moves
            }
            mazeScene.setOnKeyPressed(event -> robot.handleMovement(event, mazeImage2));
            timeline.play(); // Start the timeline when switching to the maze scene
            primaryStage.setScene(mazeScene); // Switch to the maze scene



        });
        startButtonCar2.setOnAction(e -> {
            Pane mazeLayout = new Pane();
            mazeLayout.getChildren().addAll(mazeView2, car.getcarImageView());

            Scene mazeScene = new Scene(mazeLayout, mazeImage2.getWidth(), mazeImage2.getHeight());

            int delay = 0;

            for (int i = 0; i < positions2.size(); i++) {
                final int index = i;
                KeyFrame keyFrame = new KeyFrame(Duration.millis(delay), event -> {
                    // Get the current and next position
                    double[] currentPosition = positions2.get(index);
                    double[] nextPosition = (index + 1 < positions2.size()) ? positions2.get(index + 1) : currentPosition;

                    // Update the car's position
                    car.getcarImageView().setX(currentPosition[0]);
                    car.getcarImageView().setY(currentPosition[1]);

                    // Determine the direction based on movement
                    if (nextPosition[0] > currentPosition[0]) {
                        // Moving right
                        car.getcarImageView().setRotate(0);
                    } else if (nextPosition[0] < currentPosition[0]) {
                        // Moving left
                        car.getcarImageView().setRotate(0);

                    } else if (nextPosition[1] > currentPosition[1]) {
                        // Moving down
                        car.getcarImageView().setRotate(90);


                    } else if (nextPosition[1] < currentPosition[1]) {
                        // Moving up
                        car.getcarImageView().setRotate(270);
                    }
                });
                timeline.getKeyFrames().add(keyFrame);
                delay += 500;
            }

            timeline.play();
            primaryStage.setScene(mazeScene); // Switch to the maze scene
        });

        startmanualButtonCar2.setOnAction(e -> {
            Pane mazeLayout = new Pane();
            mazeLayout.getChildren().addAll(mazeView2, car.getcarImageView());

            Scene mazeScene = new Scene(mazeLayout, mazeImage2.getWidth(), mazeImage2.getHeight());
            mazeScene.setOnKeyPressed(event -> car.handleMovement(event, mazeImage2));
            timeline.play(); // This Starts the timeline when switching to the maze scene
            primaryStage.setScene(mazeScene); // Switch to the maze scene

        });
        GridPane welcomeLayout = new GridPane();

        Label label = new Label("Select One Of The Following Actions");
        Label label2 = new Label("Select One Of The Following Actions");


        GridPane welcomeLayout2 = new GridPane();

        welcomeLayout.setVgap(10);
        welcomeLayout.setHgap(10);

        welcomeLayout2.setVgap(10);
        welcomeLayout2.setHgap(10);



        TabPane tabPane = new TabPane();


        Tab maze1Tab = new Tab("Maze 1");
        maze1Tab.setContent(welcomeLayout);

        Tab maze2Tab = new Tab("Maze 2");
        maze2Tab.setContent(welcomeLayout2);

        tabPane.getTabs().addAll( maze1Tab, maze2Tab);

        // Sets up the scene
        Scene scene = new Scene(tabPane, 800, 600);


        welcomeLayout.setAlignment(Pos.CENTER);
        welcomeLayout.add(label, 0, 0, 2, 1);

        // Add buttons to GridPane
        welcomeLayout.add(startButton, 0, 2);
        welcomeLayout.add(startmanualButton, 1, 2);
        welcomeLayout.add(startButtonCar, 0, 3);
        welcomeLayout.add(startmanualButtonCar, 1, 3);
 welcomeLayout2.setAlignment(Pos.CENTER);
        welcomeLayout2.add(label2, 0, 0, 2, 1);

        // Add buttons to GridPane
        welcomeLayout2.add(startButton2, 0, 2);
        welcomeLayout2.add(startmanualButton2, 1, 2);
        welcomeLayout2.add(startButtonCar2, 0, 3);
        welcomeLayout2.add(startmanualButtonCar2, 1, 3);


        primaryStage.setTitle("Maze Game");
        primaryStage.setScene(scene);
        primaryStage.show();


        timeline.play();



    }


    public static void main(String[] args) {
        launch(args);




    }
}
