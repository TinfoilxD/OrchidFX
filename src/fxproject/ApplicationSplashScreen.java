package fxproject;/*
 * Written by Tin Van on 2/15/16.
 */

import javafx.animation.PauseTransition;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import javafx.util.Duration;

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

        PauseTransition pause = new PauseTransition(Duration.millis(2000));
        pause.setOnFinished(e -> {
            new MainSystem();
            window.close();
        });
        pause.playFromStart();





    }
    private Scene loadView()
    {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("../main/resources/splashscreen.fxml"));
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
    private void loadMainScreen()
    {
        new MainSystem();
    }



}
