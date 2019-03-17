package com.jpk.main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main (String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Application label");
        Label label = new Label("Label !!!");
        Scene scene = new Scene(label, 100,100);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
