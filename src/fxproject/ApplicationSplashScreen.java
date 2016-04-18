package fxproject;/*
 * Written by Tin Van on 2/15/16.
 */

import javafx.animation.PauseTransition;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import javafx.util.Duration;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
        window.setScene(loadView());
        window.initStyle(StageStyle.UNDECORATED);
        window.sizeToScene();
        window.show();



        loadDatabaseScreen();
        window.close();





    }
    private Scene loadView()
    {
        try
        {
            //FXMLLoader loader = new FXMLLoader();
            URL url = getClass().getResource("/main/resources/splashscreen.fxml");
            Parent root = FXMLLoader.load(url);
            Scene scene = new Scene(root);
            return scene;
        }
        catch(Exception e)
        {
            /*
            Error messages. This will printout to an alertbox later on during validation.
             */
            e.printStackTrace();

        }
        return null;
    }
    private void loadDatabaseScreen() throws IOException
    {
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
//            FileWriter fw = new FileWriter ("/run.log", true);
//            PrintWriter pw = new PrintWriter (fw);
//            e.printStackTrace(pw);
//            pw.close();
            new OrchidAlertBox("Error",e.toString());
        }
    }



}
