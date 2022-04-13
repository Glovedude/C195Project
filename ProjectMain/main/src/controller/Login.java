package controller;


import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

public class Login implements Initializable {
    public Button LoginProceed;
    public PasswordField loginPassword;
    public TextField loginUserID;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    public void LoginProceed(ActionEvent actionEvent) {
    }

    public void setLoginPassword(PasswordField loginPassword) {
        this.loginPassword = loginPassword;
    }


    // Add time field and error message on wrong password or empty fields. Must auto translate to french when necessary.
}
