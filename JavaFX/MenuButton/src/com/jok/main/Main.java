package com.jok.main;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.FileInputStream;

public class Main  extends Application {

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Menu Application");

        Label label = new Label("Not clicked");


        MenuItem menuItem1 = new MenuItem("Option1");
        menuItem1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                label.setText("Clicked 1!");
            }
        });

        MenuItem menuItem2 = new MenuItem("Option2");
        menuItem2.setOnAction(event -> {
            label.setText("Clicked 2!");
        });

        MenuItem menuItem3 = new MenuItem("Option3");
        menuItem3.setOnAction(event -> {
            label.setText("Clicked 3!");
        });

        FileInputStream input = new FileInputStream("resources/images/image.jpg");
        Image image = new Image(input);
        ImageView imageView = new ImageView(image);

        MenuButton menuButton = new MenuButton("Options", imageView, menuItem1,menuItem2,menuItem3);
        HBox hBox = new HBox(menuButton,label);
        Scene scene = new Scene(hBox,400,200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}