package ru.com.arcadelauncher.controllers;

import com.sun.jersey.api.client.ClientResponse;
import javafx.fxml.FXML;
import org.springframework.beans.factory.annotation.Autowired;
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
        ClientResponse clientResponse = phoneInputService.sendSms();

        Code code = clientResponse.getEntity(Code.class);

        System.out.println(code.getCode());
        System.out.println(code.getId());
    }
}
