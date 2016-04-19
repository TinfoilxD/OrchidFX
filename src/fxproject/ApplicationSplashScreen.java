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
    Stage window;
    public static void main(String args[])
    {

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        window = primaryStage;
        loadDatabaseScreen();
        window.close();
    }

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
