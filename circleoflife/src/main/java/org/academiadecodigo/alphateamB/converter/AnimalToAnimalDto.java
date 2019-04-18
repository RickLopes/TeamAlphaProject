package org.academiadecodigo.alphateamB.converter;

import org.academiadecodigo.alphateamB.command.AnimalDto;
import org.academiadecodigo.alphateamB.persistence.model.animal.Animal;

public class AnimalToAnimalDto extends AbstractConverter<Animal, AnimalDto> {

    /**
     * Converts the animal jpa object into an animal DTO
     * @param animal the animal
     * @return the animal DTO
     */
    @Override
    public AnimalDto convert(Animal animal) {

        AnimalDto animalDto = new AnimalDto();
        animalDto.setId(animal.getId());
        animalDto.setAnimalType(animal.getAnimalType());

        return animalDto;
    }
}