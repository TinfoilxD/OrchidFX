package fxproject;/*
 * Written by Tin Van on 2/15/16.
 */

import com.sun.deploy.util.SessionState;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.HashMap;

public class RootStageContainer
{

    HashMap<String, Object> Controllermap;
    Stage mainStage;

    private Pane topContainer;
    private Pane bottomContainer;

    public RootStageContainer()
    {
        mainStage = new Stage();
        mainStage.setScene(getSceneStructure());
        mainStage.sizeToScene();
        mainStage.show();

    }
    private Scene getSceneStructure()
    {
        VBox viewComponents = new VBox();
        topContainer = loadTopView();
        bottomContainer = loadBottomView();
        viewComponents.getChildren().addAll(topContainer, bottomContainer);
        Scene mainView = new Scene(viewComponents, 500, 400);
        return mainView;

    }
    private Pane loadTopView()
    {
        Pane topContainer;
        try
        {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../main/resources/menuscreen.fxml"));
            topContainer = loader.load();
            topContainer.layout();
            return topContainer;

        }
        catch(Exception e)
        {

            e.printStackTrace();

        }
        return null;

    }
    private Pane loadBottomView()
    {
        Pane bottomContainer = new StackPane();
        return bottomContainer;


    }
    private void initiateFileMap()
    {
        Controllermap.put(ClientController.VIEWCONTROLLER_TITLE, new ClientController().loadView());
    }
    public void changeView()
    {

    }
    public void deleteAllChildren()
    {
        mainStage.close();

    }
}
