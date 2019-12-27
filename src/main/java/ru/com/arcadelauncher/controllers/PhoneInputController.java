package ru.com.arcadelauncher.controllers;

import javafx.fxml.FXML;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.com.arcadelauncher.services.PhoneInputService;

@Component("PhoneInputController")
public class PhoneInputController {

    @Autowired
    private PhoneInputService phoneInputService;

    @FXML
    public void sendSms() {
        phoneInputService.sendSms();
    }
}
