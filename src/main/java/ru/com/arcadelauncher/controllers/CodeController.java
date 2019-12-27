package ru.com.arcadelauncher.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.com.arcadelauncher.services.CodeService;

@Component("CodeController")
public class CodeController extends AbstractController {

    @Autowired
    CodeService codeService;

    public void verifyCode() {
        codeService.verifyCode();
    }
}
