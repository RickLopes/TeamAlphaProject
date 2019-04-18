package org.academiadecodigo.alphateamB.controllers;

import org.academiadecodigo.alphateamB.command.AnimalDto;
import org.academiadecodigo.alphateamB.converter.AnimalDtoToAnimal;
import org.academiadecodigo.alphateamB.converter.AnimalToAnimalDto;
import org.academiadecodigo.alphateamB.exceptions.AnimalNotFoundException;
import org.academiadecodigo.alphateamB.exceptions.UserNotFoundException;
import org.academiadecodigo.alphateamB.persistence.model.User;
import org.academiadecodigo.alphateamB.persistence.model.animal.Animal;
import org.academiadecodigo.alphateamB.service.AnimalService;
import org.academiadecodigo.alphateamB.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/pet")
public class RestAnimalController {

    private UserService userService;
    private AnimalService animalService;
    private AnimalToAnimalDto animalToAnimalDto;
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
    public void setAnimalToAnimalDto(AnimalToAnimalDto animalToAnimalDto) {
        this.animalToAnimalDto = animalToAnimalDto;
    }

    @Autowired
    public void setAnimalDtoToAnimal(AnimalDtoToAnimal animalDtoToAnimal) {
        this.animalDtoToAnimal = animalDtoToAnimal;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{cid}/animal")
    public ResponseEntity<List<AnimalDto>> listUserAnimals(@PathVariable Integer cid) {

        User user = userService.get(cid);

        if (user == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        List<AnimalDto> animalDtos = new ArrayList<>();
        for (Animal animal : user.getAnimals()) {
            animalDtos.add(animalToAnimalDto.convert(animal));
        }

        return new ResponseEntity<>(animalDtos, HttpStatus.OK);
    }


    @RequestMapping(method = RequestMethod.GET, path = "/{cid}/animal/{aid}")
    public ResponseEntity<AnimalDto> showUserAnimal(@PathVariable Integer cid, @PathVariable Integer aid) {

        Animal animal = animalService.get(aid);

        if (animal == null || animal.getUser() == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        if (!animal.getUser().getId().equals(cid)) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(animalToAnimalDto.convert(animal), HttpStatus.OK);
    }


    @RequestMapping(method = RequestMethod.POST, path = "/{aid}/animal")
    public ResponseEntity<?> addAnimal(@PathVariable Integer cid, @Valid @RequestBody AnimalDto animalDto, BindingResult bindingResult, UriComponentsBuilder uriComponentsBuilder) {

        if (bindingResult.hasErrors() || animalDto.getId() != null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        try {

            Animal animal = userService.addAnimal(cid, animalDtoToAnimal.convert(animalDto));

            UriComponents uriComponents = uriComponentsBuilder.path("/api/animal/" + cid + "/animal/" + animal.getId()).build();
            HttpHeaders headers = new HttpHeaders();
            headers.setLocation(uriComponents.toUri());

            return new ResponseEntity<>(headers, HttpStatus.CREATED);

        } catch (AnimalNotFoundException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }

    }


    @RequestMapping(method = RequestMethod.GET, path = "/{aid}/animal/{aid}/close")
    public ResponseEntity<?> closeAnimal(@PathVariable Integer cid, @PathVariable Integer aid) {

        try {

            animalService.closeAnimal(cid, aid);

            return new ResponseEntity<>(HttpStatus.OK);

        } catch (UserNotFoundException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        } catch (AnimalNotFoundException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);


        }
    }
}
