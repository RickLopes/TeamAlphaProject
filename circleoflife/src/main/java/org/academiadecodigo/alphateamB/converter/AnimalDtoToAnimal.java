package org.academiadecodigo.alphateamB.converter;

import org.academiadecodigo.alphateamB.command.AnimalDto;
import org.academiadecodigo.alphateamB.factories.AnimalFactory;
import org.academiadecodigo.alphateamB.persistence.model.animal.Animal;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class AnimalDtoToAnimal implements Converter<AnimalDto, Animal> {

    private AnimalFactory animalFactory;

    public void setAnimalFactory(AnimalFactory animalFactory){
        this.animalFactory = animalFactory;
    }

    @Override
    public Animal convert(AnimalDto animalDto) {

        Animal animal = null;
        animal = animalFactory.createAnimal(animalDto.getAnimalType());

        return animal;
    }


}