package fxproject;/*
 * Written by Tin Van on 2/15/16.
 */

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import java.time.Duration;

public class ApplicationSplashScreen extends Application
{
    public static void main(String args[])
    {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        Stage window = primaryStage;
        window.setScene(loadView());
        window.initStyle(StageStyle.UNDECORATED);
        window.sizeToScene();
        window.show();



        new Thread()

{
            public void run()
            {

                Platform.runLater(new Runnable()
                {
                    public void run()
                    {
                        try
                        {
                            sleep(2000);
                            loadMainScreen();
                        }
                        catch(Exception e)
                        {
                            e.printStackTrace();
                        }
                    }
                });
            }
        }.start();


    }
    private Scene loadView()
    {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("../main/resources/SplashScreen.fxml"));
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

    }



}
