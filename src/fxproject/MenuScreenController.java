package fxproject;/*
 * Written by Tin Van on 2/22/16.
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class MenuScreenController
{

    @FXML
    protected void handleFileCloseButtonAction(ActionEvent event)
    {
        MainSystem.getCurrentSystem().handleApplicationCloseEvent();
    }
    @FXML
    protected void handleClientNewClientAction(ActionEvent event)
    {

            RootStageContainer.getCurrentRootStageContainer().changeView(ClientController.VIEWCONTROLLER_TITLE);
    }
    @FXML
    protected void handleProjectTradeShowNewTradeShowAction(ActionEvent event)
    {
        RootStageContainer.getCurrentRootStageContainer().changeView(TradeShowController.VIEWCONTROLLER_TITLE);
    }
    @FXML
    protected void handleEmployeeNewEmployeeAction(ActionEvent event)
    {
        RootStageContainer.getCurrentRootStageContainer().changeView(EmployeeController.VIEWCONTROLLER_TITLE);
    }
    @FXML
    protected void handleEmployeeEditEmployeeAction(ActionEvent event)
    {
        RootStageContainer.getCurrentRootStageContainer().changeView(EditEmployeeController.VIEWCONTROLLER_TITLE);
    }

}
