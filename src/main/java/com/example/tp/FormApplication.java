package com.example.tp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.lang.reflect.Field;

/*public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
*/

    public class FormApplication extends Application{
        @Override
        public void start(Stage stage) throws IOException{
            FXMLLoader fxmlLoader = new FXMLLoader(FormApplication.class.getResource("hello-view.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 320, 240);
            stage.setTitle("Formulaire");



             Label userName= new Label("Nom");
            Label password= new Label("Mot de passe");
             Label email= new Label("Email");

            TextField nameField = new TextField();
            TextField passwordField = new TextField();
            TextField emailField = new TextField();

            Button saveButton= new Button();
            Button exitButton = new Button();
            ToggleGroup toggleGroup = new ToggleGroup();
            RadioButton studentButton = new RadioButton();
            RadioButton staffButton = new RadioButton();

            studentButton.setToggleGroup(toggleGroup);
            staffButton.setToggleGroup(toggleGroup);

            
            stage.setScene(scene);
            stage.show();


         //   saveButton.setOnAction( );{}

    }
    public static void main(String[] args) {
        launch();
    }
}