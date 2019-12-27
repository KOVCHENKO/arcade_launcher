package ru.com.arcadelauncher.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component("MainController")
public class MainController extends AbstractController {

    @FXML
    public void start(ActionEvent event) {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/phone.fxml"));
        Parent phoneInput = null;
        try {
            phoneInput = fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Stage stage = new Stage();
        stage.setScene(new Scene(phoneInput));
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setMaximized(true);
        stage.show();
    }

    private void showAlert(String message, String title, Alert.AlertType type) {
        Alert alert = new Alert(type);
        alert.showAndWait();
    }
}
