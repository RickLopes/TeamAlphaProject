package org.academiadecodigo.alphateam.controllers;

import org.academiadecodigo.alphateam.command.UserDto;
import org.academiadecodigo.alphateam.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/customer")
public class UserController {

    private UserService userService;
    private UserDtoToUser userDtoToUser;
    private USerToUserDto userToUserDto;

    @Autowired
    public void setCustomerService(UserService userService) {
        this.userService = userService;
    }


    @Autowired
    public void setCustomerDtoToCustomer(UserDtoToUser userDtoToUser) {
        this.userDtoToUser = userDtoToUser;
    }


    @Autowired
    public void setCustomerToCustomerDto(UserToUserDto userToUserDto) {
        this.userToUserDto = userToUserDto;
    }


    @RequestMapping(method = RequestMethod.GET, path = {"/", ""})
    public ResponseEntity<List<UserDto>> listCustomers() {

        List<UserDto> userDtos = userToUserDto.convert(userService.list());

        return new ResponseEntity<>(userDtos, HttpStatus.OK);
    }


    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public ResponseEntity<UserDto> showCustomer(@PathVariable Integer id) {

        User user = userService.get(id);

        if (user == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(userToUserDto.convert(customer), HttpStatus.OK);
    }


    @RequestMapping(method = RequestMethod.POST, path = {"/", ""})
    public ResponseEntity<?> addUser(@Valid @RequestBody UserDto userDto, BindingResult bindingResult, UriComponentsBuilder uriComponentsBuilder) {

        if (bindingResult.hasErrors() || userDto.getId() != null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        User savedUser = userService.save(userDtoToUser.convert(userDto));

        // get help from the framework building the path for the newly created resource
        UriComponents uriComponents = uriComponentsBuilder.path("/api/customer/" + savedUser.getId()).build();


        // set headers with the created path
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(uriComponents.toUri());

        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }


    @RequestMapping(method = RequestMethod.PUT, path = "/{id}")
    public ResponseEntity<UserDto> editCustomer(@Valid @RequestBody UserDto userDto, BindingResult bindingResult, @PathVariable Integer id) {

        if (bindingResult.hasErrors()) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        if (userDto.getId() != null && !userDto.getId().equals(id)) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        if (userService.get(id) == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        userDto.setId(id);

        userService.save(userDtoToUser.convert(userDto));
        return new ResponseEntity<>(HttpStatus.OK);
    }


    @RequestMapping(method = RequestMethod.DELETE, path = "/{id}")
    public ResponseEntity<UserDto> deleteCustomer(@PathVariable Integer id) {

        try {

            userService.delete(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);

        } catch (AssociationExistsException e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

        } catch (CustomerNotFoundException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
