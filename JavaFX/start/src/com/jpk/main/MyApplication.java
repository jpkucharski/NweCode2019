package com.jpk.main;

import javafx.application.Application;
import javafx.stage.Stage;

public class MyApplication extends Application {

    public static void main (String[] args){
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Application");
        primaryStage.show();
    }
}
