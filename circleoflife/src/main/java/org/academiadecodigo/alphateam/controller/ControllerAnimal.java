package org.academiadecodigo.alphateam.controller;

import org.academiadecodigo.alphateam.model.Owner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pet")
public class ControllerAnimal {

    @GetMapping("/customers/{id}")
    public ResponseEntity getCustomer(@PathVariable("id") Long id) {

        Owner customer = customerDAO.get(id);
        if (customer == null) {
            return new ResponseEntity("No Owener found with that ID.", HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity(owner, HttpStatus.OK);
    }

}
