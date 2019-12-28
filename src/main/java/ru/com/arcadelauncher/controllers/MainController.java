package ru.com.arcadelauncher.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.KeyEvent;
import org.springframework.stereotype.Component;


import static javafx.scene.input.KeyCode.KP_DOWN;
import static javafx.scene.input.KeyCode.KP_LEFT;

@Component("MainController")
public class MainController extends AbstractController {

    @FXML
    public void start(ActionEvent event) {
        PhoneInputController controller =
                (PhoneInputController) runController("phone");
    }

    @FXML
    void keyPressed(KeyEvent event) {
        switch (event.getCode()) {
            case ENTER:
                System.out.println("down");
                PhoneInputController controller =
                        (PhoneInputController) runController("phone");
                break;
            default:
                break;
        }
    }
}
