package org.academiadecodigo.alphateamB.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pet")
public class AnimalController {

    private UserService userService;
    private AnimalService animalService;
    private AnimalToAnimalDTO animalToAnimalDto;
    private AnimalDtoToAnimal animalDtoToAnimal;

    

}
