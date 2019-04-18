package org.academiadecodigo.alphateamB.converter;

import org.academiadecodigo.alphateamB.command.UserDto;
import org.academiadecodigo.alphateamB.persistence.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

public class UserDtoToUser implements Converter<UserDto, User> {

    private UserService userService;

    /**
     * Sets the user service
     *
     * @param userService the user service to set
     */

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    /**
     * Converts the customer DTO into a customer jpa object
     *
     * @param userDto the customer DTO
     * @return the customer
     */
    @Override
    public User convert(UserDto userDto) {

        User user = (userDto.getId() != null ? userService.get(userDto.getId()) : new User());

        user.setFirstName(user.getFirstName());
        user.setLastName(user.getLastName());
        user.setEmail(user.getEmail());
        user.setPhone(user.getPhone());
        user.setPassword(user.getPassword());
        user.setPassConfirm(user.getPassConfirm());

        return user;

    }
}

