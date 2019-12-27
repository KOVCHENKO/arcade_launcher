package ru.com.arcadelauncher.controllers;

import javafx.fxml.FXML;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import ru.com.arcadelauncher.entity.Code;
import ru.com.arcadelauncher.services.IPhoneInputService;

@Component("PhoneInputController")
public class PhoneInputController extends AbstractController {

    @Autowired
    private IPhoneInputService phoneInputService;

    public void initialize() {

    }

    @FXML
    public void sendSms() {
        int responseStatus = phoneInputService.sendSms();

        if (responseStatus == HttpStatus.OK.value()) {
            System.out.println(responseStatus);
            CodeController codeController = (CodeController) runController("code");

            phoneInputService.defineCode();
        } else {
            System.out.println("IMPOSSIBLE TO KNOCK");
        }
    }
}
