package com.example.tp;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
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

        public void onSaveButton(){
            System.out.println("Saving!!!");
        }
        public void onExitButton(){
            System.out.println("Closing");
            System.exit(0);
        }
        @Override
        public void start(Stage stage) throws IOException{
          //  FXMLLoader fxmlLoader = new FXMLLoader(FormApplication.class.getResource("hello-view.fxml"));




             Label userName= new Label("Nom");
            Label password= new Label("Mot de passe");
             Label email= new Label("Email");

            TextField nameField = new TextField();

            TextField passwordField = new TextField();
            TextField emailField = new TextField();

            Button saveButton= new Button("Save");
            Button exitButton = new Button("exit");
            ToggleGroup toggleGroup = new ToggleGroup();
            RadioButton studentButton = new RadioButton("Student");
            RadioButton staffButton = new RadioButton("Staff");


            studentButton.setToggleGroup(toggleGroup);
            staffButton.setToggleGroup(toggleGroup);
            

            GridPane root = new GridPane();
            root.add(userName,0,0);
            root.add(nameField,1,0);

            root.add(password,0,1);
            root.add(passwordField,1,1);

            root.add(email,0,2);
            root.add(emailField,1,2);

            root.add(studentButton,0,3);
            root.add(staffButton,1,3);

            root.add(saveButton,1,4);
            root.add(exitButton,0,4);


            saveButton.setOnAction(actionEvent -> {
                onSaveButton();
            });
            exitButton.setOnAction(actionEvent -> {
                onExitButton();
            });
            Scene scene = new Scene(root, 320, 240);
            stage.setTitle("Formulaire");
            stage.setScene(scene);
            stage.setOnCloseRequest(windowEvent -> {
                onExitButton();
            });
            stage.show();


         //   saveButton.setOnAction( );{}

    }
    public static void main(String[] args) {
        launch();
    }
}