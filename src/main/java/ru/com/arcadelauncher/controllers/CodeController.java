package ru.com.arcadelauncher.controllers;

import org.springframework.stereotype.Component;
import ru.com.arcadelauncher.entity.Code;

@Component("CodeController")
public class CodeController extends AbstractController {

    public Code code;

    public void verifyCode() {
        System.out.println(code.getCode());
        System.out.println(code.getId());
    }
}
