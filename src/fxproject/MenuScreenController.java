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

}
