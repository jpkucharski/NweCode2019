package com.jpk.main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.FileInputStream;

public class Main extends Application {

    public static void main (String[] args){
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        FileInputStream fileInputStream = new FileInputStream("resources/images/image.jpg");
        Image image = new Image(fileInputStream);
        ImageView imageView = new ImageView(image);

        HBox hBox = new HBox(imageView);

        Scene scene = new Scene(hBox, 100, 100);
        primaryStage.setTitle("Application");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
