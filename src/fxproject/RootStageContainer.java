package fxproject;/*
 * Written by Tin Van on 2/15/16.
 */

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
    private final int SCREEN_HEIGHT = 1200; //main application layout parameters
    private final int SCREEN_WIDTH = 800;

    /*
    The controllermap has references to the views and controllers so they exist in memory upon load. This is done to reduce
    the procesing requirements of loading a new stage.
     */
    HashMap<String, NodeBundle> controllermap;


    Stage mainStage; //high level container

    private Pane topContainer; //container to contain the menuscreen since there is only one menuscreen
    private Pane bottomContainer; //container to contain the layout of the current screen
    private static RootStageContainer currentRootStageContainer; //reference to an instance of rootstage container so any class can call its methods



    public RootStageContainer()
    {
        setCurrentRootStageContainer(this);
        controllermap = new HashMap<String, NodeBundle>();
        mainStage = new Stage();
        mainStage.setOnCloseRequest(event -> MainSystem.getCurrentSystem().handleApplicationCloseEvent());
        mainStage.setScene(getSceneStructure());
        mainStage.sizeToScene();
        mainStage.setResizable(false);
        initiateFileMap();
        mainStage.show();
        changeView(EditProjectController.VIEWCONTROLLER_TITLE); //set defaultview
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
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/main/resources/menuscreen.fxml"));
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
        controllermap.put(ClientController.VIEWCONTROLLER_TITLE, new ClientController().loadBundle());
        controllermap.put(EmployeeController.VIEWCONTROLLER_TITLE, new EmployeeController().loadBundle());
        controllermap.put(EditProjectController.VIEWCONTROLLER_TITLE, new EditProjectController().loadBundle());
        controllermap.put(ClientContactController.VIEWCONTROLLER_TITLE, new ClientContactController().loadBundle());
        controllermap.put(ClientContactTypeController.VIEWCONTROLLER_TITLE, new ClientContactTypeController().loadBundle());
        controllermap.put(ClientStatusController.VIEWCONTROLLER_TITLE, new ClientStatusController().loadBundle());
        controllermap.put(CMVStatusController.VIEWCONTROLLER_TITLE, new CMVStatusController().loadBundle());
        controllermap.put(ContractorController.VIEWCONTROLLER_TITLE, new ContractorController().loadBundle());
        controllermap.put(ContractorContactController.VIEWCONTROLLER_TITLE, new ContractorContactController().loadBundle());
        controllermap.put(ContractorContactTypeController.VIEWCONTROLLER_TITLE, new ContractorContactTypeController().loadBundle());
        controllermap.put(CountryController.VIEWCONTROLLER_TITLE, new CountryController().loadBundle());
        controllermap.put(HotelPropertyController.VIEWCONTROLLER_TITLE, new HotelPropertyController().loadBundle());
        controllermap.put(ManufacturerController.VIEWCONTROLLER_TITLE, new ManufacturerController().loadBundle());
        controllermap.put(ManufacturerContactController.VIEWCONTROLLER_TITLE, new ManufacturerContactController().loadBundle());
        controllermap.put(ManufacturerContactTypeController.VIEWCONTROLLER_TITLE, new ManufacturerContactTypeController().loadBundle());
        controllermap.put(OfficeLocationController.VIEWCONTROLLER_TITLE, new OfficeLocationController().loadBundle());
        controllermap.put(ParentBrandController.VIEWCONTROLLER_TITLE, new ParentBrandController().loadBundle());
        controllermap.put(PhaseLookupController.VIEWCONTROLLER_TITLE, new PhaseLookupController().loadBundle());
        controllermap.put(PhaseStatusController.VIEWCONTROLLER_TITLE, new PhaseStatusController().loadBundle());
        controllermap.put(ProjectStatusController.VIEWCONTROLLER_TITLE, new ProjectStatusController().loadBundle());
        controllermap.put(ProjectTypeController.VIEWCONTROLLER_TITLE, new ProjectTypeController().loadBundle());
        controllermap.put(ReferrerController.VIEWCONTROLLER_TITLE, new ReferrerController().loadBundle());
        controllermap.put(ReferrerTypeController.VIEWCONTROLLER_TITLE, new ReferrerTypeController().loadBundle());
        controllermap.put(DepartmentController.VIEWCONTROLLER_TITLE, new DepartmentController().loadBundle());
        controllermap.put(StateController.VIEWCONTROLLER_TITLE, new StateController().loadBundle());
        controllermap.put(TaskListController.VIEWCONTROLLER_TITLE, new TaskListController().loadBundle());
        controllermap.put(TradeShowController.VIEWCONTROLLER_TITLE, new TradeShowController().loadBundle());
        controllermap.put(UserController.VIEWCONTROLLER_TITLE, new UserController().loadBundle());
        controllermap.put(VendorController.VIEWCONTROLLER_TITLE, new VendorController().loadBundle());
        controllermap.put(VendorContactController.VIEWCONTROLLER_TITLE, new VendorContactController().loadBundle());
        controllermap.put(VendorContactTypeController.VIEWCONTROLLER_TITLE, new VendorContactTypeController().loadBundle());
        controllermap.put(ReportController.VIEWCONTROLLER_TITLE, new ReportController().loadBundle());

    }

    public void changeView(String viewControllerTitle)
    {
        bottomContainer.getChildren().clear();
        bottomContainer.getChildren().add(controllermap.get(viewControllerTitle).getNode());

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
    public NodeBundle getBundle(String viewControllerTitle)
    {
        return controllermap.get(viewControllerTitle);
    }
}
