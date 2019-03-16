package com.jpk.main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class MyApplication extends Application {

    public static void main (String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Stage stage = new Stage();
        VBox vbox = new VBox(new Label("Label in the VBox!"));
        Scene scene = new Scene(vbox);
        stage.setTitle("Application");
        stage.setX(50);
        stage.setY(50);
        stage.setWidth(200);
        stage.setHeight(200);
        stage.setScene(scene);
//        stage.initStyle(StageStyle.DECORATED);
//        stage.initStyle(StageStyle.UNDECORATED);
//        stage.initStyle(StageStyle.TRANSPARENT);
//        stage.initStyle(StageStyle.UNIFIED);
        stage.initStyle(StageStyle.UTILITY);
        stage.setFullScreen(true);
        stage.show();
    }
}
