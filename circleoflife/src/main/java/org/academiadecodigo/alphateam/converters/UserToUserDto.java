package org.academiadecodigo.alphateam.converters;

import org.academiadecodigo.alphateam.command.UserDto;
import org.academiadecodigo.alphateam.model.User;

public class UserToUserDto extends AbstractConverter<User, UserDto> {

    /**
     * Converts the user model object into a user DTO
     *
     * @param user the user
     * @return the user DTO
     */

    @Override
    public UserDto convert(User user) {

        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setFirstName(user.getFirstName());
        userDto.setLastName(user.getLastName());
        userDto.setEmail(user.getEmail());
        userDto.setPhone(user.getPhone());

        return userDto;
    }
}
