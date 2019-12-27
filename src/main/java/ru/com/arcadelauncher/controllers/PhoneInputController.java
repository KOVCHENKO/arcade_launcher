package ru.com.arcadelauncher.controllers;

import javafx.fxml.FXML;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.com.arcadelauncher.services.IPhoneInputService;

@Component("PhoneInputController")
public class PhoneInputController extends AbstractController {

    @Autowired
    private IPhoneInputService phoneInputService;

    public void initialize() {

    }

    @FXML
    public void sendSms() {
        phoneInputService.sendSms();
    }
}
