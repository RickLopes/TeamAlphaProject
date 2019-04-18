package org.academiadecodigo.alphateamB.exceptions;

import org.academiadecodigo.alphateamB.errors.ErrorMessage;

public class AssociationExistsException extends AlphateamException{

    public AssociationExistsException() {
        super(ErrorMessage.ASSOCIATION_EXISTS);
    }
}
