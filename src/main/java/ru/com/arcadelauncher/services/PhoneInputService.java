package ru.com.arcadelauncher.services;

import org.springframework.stereotype.Service;

@Service("PhoneInputService")
public class PhoneInputService implements IPhoneInputService {

    public void sendSms() {
        System.out.println("It is print ln in service");
    }
}
