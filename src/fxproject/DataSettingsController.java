package fxproject;/*
 * Written by Tin Van on 2/20/16.
 */


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class DataSettingsController
{
    public static final String VIEWCONTROLLER_TITLE= "DataSettings";

    @FXML
    TextField fieldhostname;
    @FXML
    TextField fieldportnumber;
    @FXML
    TextField fielddatabasename;
    @FXML
    TextField fieldusername;
    @FXML
    PasswordField fieldpassword;

    public DataSettingsController()
    {

    }

    @FXML
    public void initialize()
    {
        OrchidDataSource dataSource = new OrchidDataSource();
        fieldhostname.setText(dataSource.getHostname());
        fieldportnumber.setText(String.valueOf(dataSource.getPortNumber()));
        fielddatabasename.setText(dataSource.getDatabaseName());
        fieldusername.setText(dataSource.getUsername());
        fieldpassword.setText(dataSource.getPassword());
    }
    @FXML
    protected void handleButtonSubmit(ActionEvent e)
    {
        try
        {
            OrchidDataSource dataSource = new OrchidDataSource();
            dataSource.setDataSourceSettings(fieldusername.getText(),
                    fieldpassword.getText(),
                    fieldhostname.getText(),
                    Integer.parseInt(fieldportnumber.getText()),
                    fielddatabasename.getText());
            new MainSystem();

            Node  source = (Node)  e.getSource();
            Stage stage  = (Stage) source.getScene().getWindow();
            stage.close();


        }
        catch(Exception ae)
        {
            new OrchidAlertBox("Error", ae.toString());
        }
    }


}
