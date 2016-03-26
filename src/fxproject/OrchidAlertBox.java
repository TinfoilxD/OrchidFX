package fxproject;/*
 * Written by Tin Van on 3/25/16.
 */

import javafx.scene.control.Alert;

public class OrchidAlertBox
{
    public OrchidAlertBox(String alertHeader, String alertContent)
    {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(alertHeader);
        alert.setContentText(alertContent);
        alert.showAndWait();
    }
}
