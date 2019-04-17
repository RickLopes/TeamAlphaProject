package org.academiadecodigo.alphateam.converters;

import org.academiadecodigo.alphateam.command.AnimalDto;
import org.academiadecodigo.alphateam.model.animal.Animal;

public class AnimalToAnimalDto extends AbstractConverter<Animal, AnimalDto> {

    /**
     * Converts the animal model object into an animal DTO
     * @param animal the animal
     * @return the animal DTO
     */
    @Override
    public AnimalDto convert(Animal animal) {

        AnimalDto animalDto = new AnimalDto();
        animalDto.setId(animal.getId());
        animalDto.setType(animal);


        return animalDto;
    }{
}
