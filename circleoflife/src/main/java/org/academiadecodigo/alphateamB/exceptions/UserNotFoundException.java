package org.academiadecodigo.alphateamB.exceptions;


import org.academiadecodigo.alphateamB.errors.ErrorMessage;

public class UserNotFoundException extends AlphateamException{

    public UserNotFoundException() {
        super(ErrorMessage.USER_NOT_FOUND);
    }
}
