package ru.com.arcadelauncher.services;

import com.sun.jersey.api.client.ClientResponse;

public interface IPhoneInputService {
    public ClientResponse sendSms();
}
