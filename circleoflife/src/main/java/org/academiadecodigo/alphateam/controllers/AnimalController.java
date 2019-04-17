package org.academiadecodigo.alphateam.controllers;

import org.academiadecodigo.alphateam.command.AnimalDto;
import org.academiadecodigo.alphateam.model.User;
import org.academiadecodigo.alphateam.model.animal.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/pet")
public class AnimalController {

    private UserService userService;
    private AnimalService animalService;
    private AnimalToAnimalDTO animalToAnimalDto;
    private AnimalDtoToAnimal animalDtoToAnimal;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Autowired
    public void setAnimalService(AnimalService animalService) {
        this.animalService = animalService;
    }

    @Autowired
    public void setAnimalToAnimalDto(AnimalToAnimalDTO animalToAnimalDto) {
        this.animalToAnimalDto = animalToAnimalDto;
    }

    @Autowired
    public void setAnimalDtoToAnimal(AnimalDtoToAnimal animalDtoToAnimal) {
        this.animalDtoToAnimal = animalDtoToAnimal;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{cid}/")
    public ResponseEntity<List<AnimalDto>> listAnimals(@PathVariable Integer cid) {

        User user = userService.get(cid);

        if (user == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        List<AnimalDto> animals = new ArrayList<>();
        for (Animal animal : user.getAnimals()) {
            animals.add(animalToAnimalDto.convert(animal));
        }

        return new ResponseEntity<>(animals, HttpStatus.OK);
    }


}
