package org.academiadecodigo.alphateamB.exceptions;

import org.academiadecodigo.alphateamB.errors.ErrorMessage;

public class AnimalNotFoundException extends AlphateamException{

    public AnimalNotFoundException() {
        super(ErrorMessage.ANIMAL_NOT_FOUND);
    }

}
