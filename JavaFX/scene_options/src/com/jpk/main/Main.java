package com.jpk.main;

import javafx.application.Application;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application
{

    public static void main (String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        VBox vBox = new VBox(new Label("VBox!!"));
        Scene scene = new Scene(vBox);

        scene.setCursor(Cursor.OPEN_HAND);
        scene.setCursor(Cursor.CLOSED_HAND);
        scene.setCursor(Cursor.CROSSHAIR);
        scene.setCursor(Cursor.DEFAULT);
        scene.setCursor(Cursor.HAND);
        scene.setCursor(Cursor.WAIT);
        scene.setCursor(Cursor.H_RESIZE);
        scene.setCursor(Cursor.V_RESIZE);
        scene.setCursor(Cursor.MOVE);
        scene.setCursor(Cursor.TEXT);

        primaryStage.setScene(scene);
        primaryStage.show();

    }
}