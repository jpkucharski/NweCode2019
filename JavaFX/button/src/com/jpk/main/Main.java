package com.jpk.main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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
        primaryStage.setTitle("Buttons");

        FileInputStream input = new FileInputStream("resources/images/image.jpg");
        Image image = new Image(input);
        ImageView imageView = new ImageView(image);

        Label label = new Label("Not clicked");
//        Button button = new Button("Click!!", imageView);

        Button button0 = new Button("Click the button!!");
        button0.setOnAction(value ->  {
            label.setText("Button0 Clicked!");
        });

        Button button1 = new Button("Button 1");
        button1.setStyle("-fx-border-color: #ff0000; -fx-border-width: 5px;");
        button1.setOnAction(value ->  {
            label.setText("Button1 Clicked!");
        });

        Button button2 = new Button("Button 2");
        button2.setStyle("-fx-background-color: #00ff00");
        button2.setOnAction(value ->  {
            label.setText("Button2 Clicked!");
        });

        Button button3 = new Button("Button 3");
        button3.setStyle("-fx-font-size: 2em; ");
        button3.setOnAction(value ->  {
            label.setText("Button3 Clicked!");
        });

        Button button4 = new Button("Button 4");
        button4.setStyle("-fx-text-fill: #0000ff");
        button4.setOnAction(value ->  {
            label.setText("Button4 Clicked!");
        });

        HBox hbox = new HBox(button0,button1,button2,button3,button4, label);

        Scene scene = new Scene(hbox, 500, 100);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
