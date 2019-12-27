package ru.com.arcadelauncher.services;

import com.sun.jersey.api.client.ClientResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;
import ru.com.arcadelauncher.entity.Code;
import ru.com.arcadelauncher.repositories.PhoneInputRepository;

@PropertySource("classpath:application.properties")
@Service("PhoneInputService")
public class PhoneInputService implements IPhoneInputService {

    @Autowired
    private PhoneInputRepository phoneInputRepository;

    public int sendSms() {
        ClientResponse clientResponse = phoneInputRepository.sendSms();

        Code code = clientResponse.getEntity(Code.class);

        return clientResponse.getStatus();
    }
}
