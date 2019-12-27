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

    private Code code;

    @Autowired
    private PhoneInputRepository phoneInputRepository;

    @Autowired
    private CodeService codeService;

    public int sendSms() {
        ClientResponse clientResponse = phoneInputRepository.sendSms();
        code = clientResponse.getEntity(Code.class);
        return clientResponse.getStatus();
    }

    public void defineCode() {
        codeService.initCode(code);
    }
}
