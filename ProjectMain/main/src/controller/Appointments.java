package controller;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Appointments implements Initializable {
    public Button AAdd;
    public Button AUpdate;
    public Button ADelete;
    public Button ACancel;
    public ComboBox AStartTime;
    public ComboBox AEndTime;
    public TextField AAppointmentID;
    public TextField ATitle;
    public TextField AType;
    public TextField ALocation;
    public TextArea ADescription;
    public DatePicker AStartDate;
    public ComboBox AContact;
    public ComboBox ACustomerID;
    public ComboBox AUserID;
    public RadioButton AViewAll;
    public RadioButton AWeekly;
    public RadioButton AMonthly;
    public TableView ATableView;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    public void AViewAll(ActionEvent ActionEvent) {}

    public void AWeekly(ActionEvent actionEvent) {}

    public void AMonthly(ActionEvent actionEvent) {}

    public void AAdd(ActionEvent actionEvent) throws IOException {

    }

    public void AUpdate(ActionEvent actionEvent) throws IOException {

    }

    public void ADelete(ActionEvent actionEvent) throws IOException {

    }

    public void ACancel(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/view/MainScreen.fxml"));
        Stage stage = (Stage) ((Button)actionEvent.getSource()).getScene().getWindow();
        Scene scene = new Scene(root, 400, 600);
        stage.setTitle("Cancel");
        stage.setScene(scene);
        stage.show();
    }
}

// pop-up messages:
//valid hours between 8am and 10 pm est include weekends. But the hours must display user timezone
// scheudling overlaps for customers - not contacts. Not users.
// incorrecft username and password
/* alrt for appointsment within 15 minutes of login that shows appointment ID, date, and time. and trigger based on
user's computer. The time must originate from the program, not the database.
if there are no upcoming appointments, then display a message that shows that
 */