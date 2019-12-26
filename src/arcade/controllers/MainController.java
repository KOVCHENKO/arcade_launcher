package arcade.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;


public class MainController {

    @FXML
    public void start(ActionEvent event) {
        System.out.println("it is starting");
        showAlert("START!", "IT IS STARTING", Alert.AlertType.INFORMATION);
    }

    private void showAlert(String message, String title, Alert.AlertType type) {
        Alert alert = new Alert(type);
        alert.showAndWait();
    }
}
