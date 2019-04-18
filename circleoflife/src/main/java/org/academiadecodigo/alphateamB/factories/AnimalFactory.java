package org.academiadecodigo.alphateamB.factories;

import org.academiadecodigo.alphateamB.persistence.model.animal.Animal;
import org.academiadecodigo.alphateamB.persistence.model.animal.AnimalType;
import org.academiadecodigo.alphateamB.persistence.model.animal.Cat;
import org.academiadecodigo.alphateamB.persistence.model.animal.Dog;
import org.springframework.stereotype.Component;

@Component
public class AnimalFactory {

    public Animal createAnimal(AnimalType animalType) {

        Animal newAnimal;

        switch (animalType) {
            case CAT:
                newAnimal = new Cat();
                break;
            case DOG:
                newAnimal = new Dog();
                break;
            default:
                throw new IllegalArgumentException("Animal invalid");
        }

        return newAnimal;
    }


}
