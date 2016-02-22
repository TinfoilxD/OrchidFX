package fxproject;/*
 * Written by Tin Van on 2/15/16.
 */

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.HashMap;

public class RootStageContainer
{

    HashMap<String, Node> controllermap;
    Stage mainStage;

    private Pane topContainer;
    private Pane bottomContainer;
    private static RootStageContainer currentRootStageContainer;
    public RootStageContainer()
    {
        setCurrentRootStageContainer(this);
        controllermap = new HashMap<String, Node>();
        mainStage = new Stage();
        mainStage.setOnCloseRequest(event -> MainSystem.getCurrentSystem().handleApplicationCloseEvent());
        mainStage.setScene(getSceneStructure());
        mainStage.sizeToScene();
        initiateFileMap();
        mainStage.show();

    }
    private Scene getSceneStructure()
    {
        VBox viewComponents = new VBox();
        topContainer = loadTopView();
        bottomContainer = loadBottomView();
        viewComponents.getChildren().addAll(topContainer, bottomContainer);
        Scene mainView = new Scene(viewComponents, 600, 500);
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
        controllermap.put(ClientController.VIEWCONTROLLER_TITLE, new ClientController().loadView());
    }
    public void changeView(String viewControllerTitle)
    {
        bottomContainer.getChildren().removeAll();
        bottomContainer.getChildren().add(controllermap.get(viewControllerTitle));


    }
    public void deleteAllChildren()
    {
        mainStage.close();

    }
    public static void setCurrentRootStageContainer(RootStageContainer newCurrentRootStageContainer)
    {
           currentRootStageContainer = newCurrentRootStageContainer;
    }
    public static RootStageContainer getCurrentRootStageContainer()
    {
        return currentRootStageContainer;
    }

}
