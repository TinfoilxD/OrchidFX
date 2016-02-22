package fxproject;/*
 * Written by Tin Van on 2/22/16.
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class MenuScreenController
{

    @FXML
    protected void handleSubmitButtonAction(ActionEvent event)
    {
        MainSystem.getCurrentSystem().handleApplicationCloseEvent();
    }

}
