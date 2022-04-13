package controller;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Customers implements Initializable {
    public TextField CID;
    public TextField CName;
    public TextField CAddress;
    public TextField CPhone;
    public TextField CPostal;
    public ComboBox CCity;
    public ComboBox CCountry;
    public Button CAdd;
    public Button CUpdate;
    public Button CDelete;
    public Button CCancel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {}

    public void CAdd(ActionEvent actionEvent) {}

    public void CUpdate(ActionEvent actionEvent) {}

    public void CDelete(ActionEvent actionEvent) {}

    public void CCancel(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/view/MainScreen.fxml"));
        Stage stage = (Stage) ((Button)actionEvent.getSource()).getScene().getWindow();
        Scene scene = new Scene(root, 400, 600);
        stage.setTitle("Cancel");
        stage.setScene(scene);
        stage.show();
    }



}
