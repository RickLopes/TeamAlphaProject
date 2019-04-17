package org.academiadecodigo.alphateam.converters;

import org.academiadecodigo.alphateam.command.AnimalDto;
import org.academiadecodigo.alphateam.command.DogDto;
import org.academiadecodigo.alphateam.factories.AnimalFactory;
import org.academiadecodigo.alphateam.model.animal.Animal;
import org.academiadecodigo.alphateam.model.animal.Dog;
import org.hibernate.sql.ANSICaseFragment;
import org.springframework.core.convert.converter.Converter;


import java.lang.annotation.Annotation;

public class AnimalDtoToAnimal implements Converter<AnimalDto, Animal> {

    private AnimalFactory animalFactory;

    public void setAnimalFactory(AnimalFactory animalFactory){
        this.animalFactory = animalFactory;
    }

    @Override
    public Animal convert(AnimalDto animalDto) {

        Animal animal = null;
        animal = animalFactory.createAnimal(animalDto.getType());

        return animal;
    }


}
