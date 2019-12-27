package ru.com.arcadelauncher.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("PhoneInputService")
@Transactional
public class PhoneInputService {

    public void sendSms() {
        System.out.println("It is print ln in service");
    }
}
