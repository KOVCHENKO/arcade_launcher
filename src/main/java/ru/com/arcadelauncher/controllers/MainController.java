package ru.com.arcadelauncher.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import org.springframework.stereotype.Component;

@Component("MainController")
public class MainController extends AbstractController {

    @FXML
    public void start(ActionEvent event) {
        PhoneInputController controller =
                (PhoneInputController) runController("phone");
    }
}
