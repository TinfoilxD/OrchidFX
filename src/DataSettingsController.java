import fxproject.MainSystem;
import fxproject.OrchidAlertBox;
import fxproject.OrchidDataSource;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class DataSettingsController
{

    @FXML private TextField fieldhostname;
    @FXML private TextField fieldportnumber;
    @FXML private TextField fielddatabasename;
    @FXML private TextField fieldusername;
    @FXML private PasswordField fieldpassword;
    @FXML private Label fieldLoginError;
    @FXML private Button fxButtonLogin;

    public static final String VIEWCONTROLLER_TITLE= "DataSettings";

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
    public void handleButtonSubmit(ActionEvent e)
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
