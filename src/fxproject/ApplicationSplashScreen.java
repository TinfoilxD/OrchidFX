package fxproject;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.*;
import java.net.URL;

public class ApplicationSplashScreen extends Application
{
    Stage window; //reference for Application launch stage

    public static void main(String args[])
    {

        launch(args); //JavaFX main method requirement
    }

    /*
    Originally, there was a timed application splashscreen, but multithreading methods seem to not go well with JAR files.
    The database settings form can be set as the first window with some modifications.

     */

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        window = primaryStage;
        loadDatabaseScreen(); //load database settings form
        window.close(); //close first application page and load database screen
    }


    /*
    Method that launches the database settings form that sends parameters to the datasource.

     */
    private void loadDatabaseScreen() throws IOException {
        try
        {
            Stage stage = new Stage();

            Parent root = FXMLLoader.load(getClass().getResource("/main/resources/DatabaseSettingsForm.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.sizeToScene();
            stage.show();
        }
        catch(Exception e)
        {
            new OrchidAlertBox("Error",e.toString());
        }
    }
}
