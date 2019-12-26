package ru.com.arcadelauncher.controllers;

import ru.com.arcadelauncher.services.PhoneInputService;

public class PhoneInputController {

    public void sendSms() {
        PhoneInputService phoneInputService = new PhoneInputService();
        phoneInputService.sendSms();
    }
}
