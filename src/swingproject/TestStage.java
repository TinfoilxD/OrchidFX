package swingproject;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class TestStage extends Application
{
    public static void main(String args[])
    {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        StackPane testPane = new StackPane();
        testPane.getChildren().add(new Button("Banana"));
        primaryStage.setScene(new Scene(testPane, 300,30));
        primaryStage.show();
    }
}
