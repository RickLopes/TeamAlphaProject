package org.academiadecodigo.alphateamB.command;

import org.springframework.stereotype.Component;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Component
public class UserDto {

    private Integer id;

    @NotNull(message = "First name is mandatory")
    @NotBlank(message = "First name is mandatory")
    @Size(min = 2, max = 64)
    private String firstName;

    @NotNull(message = "Last Name is mandatory")
    @NotBlank(message = "Last Name is mandatory")
    private String lastName;

    @Email
    @NotBlank(message = "email is mandatory")
    private String email;

    @NotNull(message = "Phone is mandatory")
    @NotBlank(message = "Phone is mandatory")
    private String phone;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
