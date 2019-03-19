package com.jpk.main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("CheckBox Experiment 1");


        CheckBox checkBox1 = new CheckBox("Green");
        CheckBox checkBox2 = new CheckBox("Blue");
        CheckBox checkBox3 = new CheckBox("Red");

        HBox hbox = new HBox(checkBox1,checkBox2,checkBox3);

        Scene scene = new Scene(hbox, 200, 100);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
