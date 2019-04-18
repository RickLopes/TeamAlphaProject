package org.academiadecodigo.alphateamB.persistence.model.animal;

import java.util.Arrays;
import java.util.List;

public enum AnimalType {

    CAT,
    DOG;

    public static List<AnimalType> list() {
        return Arrays.asList(AnimalType.values());
    }

}
