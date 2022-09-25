package com.example.lab1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {

        MusicAlbum MusicAlbum1 = new MusicAlbum(" Buzz  "," Arshad  ", LocalDate.of( 2018,3,5  ));
        MusicAlbum MusicAlbum2 = new MusicAlbum("Airlift","Arijit", LocalDate.of(2017,4,5));

        System.out.println("MusicAlbum1: "+MusicAlbum1);
        System.out.println("MusicAlbum2: "+MusicAlbum2);
    }
}