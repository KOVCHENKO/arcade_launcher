package ru.com.arcadelauncher.services;

import org.springframework.stereotype.Service;
import ru.com.arcadelauncher.entity.Code;

@Service("CodeService")
public class CodeService {

    private Code code;

    public void initCode(Code codeForVerify) {
        code = codeForVerify;
    }

    public void verifyCode() {
        System.out.println(code.getCode());
        System.out.println(code.getId());
    }

}
