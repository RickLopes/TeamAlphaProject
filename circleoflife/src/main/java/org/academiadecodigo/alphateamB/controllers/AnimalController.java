package org.academiadecodigo.alphateamB.controllers;

import org.academiadecodigo.alphateamB.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

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

    @RequestMapping(method = RequestMethod.GET, path = "/{userId}/")
    public ResponseEntity<> listAnimals(@PathVariable Integer userId) {

        User user = userService.get(userId);

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
