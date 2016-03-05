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
    private final int SCREEN_HEIGHT = 800;
    private final int SCREEN_WIDTH = 600;

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
        Scene mainView = new Scene(viewComponents, SCREEN_HEIGHT, SCREEN_WIDTH);
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
        controllermap.put(EmployeeController.VIEWCONTROLLER_TITLE, new EmployeeController().loadView());
        controllermap.put(EditEmployeeController.VIEWCONTROLLER_TITLE, new EditEmployeeController().loadView());
        controllermap.put(ClientContactController.VIEWCONTROLLER_TITLE, new ClientContactController().loadView());
        controllermap.put(ClientContactTypeController.VIEWCONTROLLER_TITLE, new ClientContactTypeController().loadView());
        controllermap.put(ClientStatusController.VIEWCONTROLLER_TITLE, new ClientStatusController().loadView());
        controllermap.put(CMVStatusController.VIEWCONTROLLER_TITLE, new CMVStatusController().loadView());
        controllermap.put(ContractorController.VIEWCONTROLLER_TITLE, new ContractorController().loadView());
        controllermap.put(ContractorContactController.VIEWCONTROLLER_TITLE, new ContractorContactController().loadView());
        controllermap.put(ContractorContactTypeController.VIEWCONTROLLER_TITLE, new ContractorContactTypeController().loadView());
        controllermap.put(ManufacturerController.VIEWCONTROLLER_TITLE, new ManufacturerController().loadView());
        controllermap.put(ManufacturerContactController.VIEWCONTROLLER_TITLE, new ManufacturerContactController().loadView());
        controllermap.put(ManufacturerContactTypeController.VIEWCONTROLLER_TITLE, new ManufacturerContactTypeController().loadView());
        controllermap.put(ProjectStatusController.VIEWCONTROLLER_TITLE, new ProjectStatusController().loadView());
        controllermap.put(ProjectTypeController.VIEWCONTROLLER_TITLE, new ProjectTypeController().loadView());
        controllermap.put(ReferrerController.VIEWCONTROLLER_TITLE, new ReferrerController().loadView());
        controllermap.put(ReferrerTypeController.VIEWCONTROLLER_TITLE, new ReferrerTypeController().loadView());
        controllermap.put(TaskListController.VIEWCONTROLLER_TITLE, new TaskListController().loadView());
        controllermap.put(TradeShowController.VIEWCONTROLLER_TITLE, new TradeShowController().loadView());
        controllermap.put(VendorController.VIEWCONTROLLER_TITLE, new VendorController().loadView());
        controllermap.put(VendorContactController.VIEWCONTROLLER_TITLE, new VendorContactController().loadView());
        controllermap.put(VendorContactTypeController.VIEWCONTROLLER_TITLE, new VendorContactTypeController().loadView());

    }
    public void changeView(String viewControllerTitle)
    {
        bottomContainer.getChildren().clear();
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
