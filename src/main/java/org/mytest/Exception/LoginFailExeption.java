package org.mytest.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.UNAUTHORIZED)
public class LoginFailExeption extends Exception {
    public LoginFailExeption(String message) {
        super(message);
    }
}
