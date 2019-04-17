package org.academiadecodigo.alphateam.command;

import org.academiadecodigo.alphateam.model.animal.SizeAnimal;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserDto {

    private Integer id;

    @NotNull(message = "Name is mandatory")
    @NotBlank(message = "Name is mandatory")
    @Size(min = 2, max = 64)
    private String name;

    @NotNull(message = "Birthdate is mandatory")
    @NotBlank(message = "Birthdate is mandatory")
    private String birthdate;

    @NotBlank(message = "Birthdate is mandatory")
    private SizeAnimal size;

    @NotNull(message = "Color is mandatory")
    @NotBlank(message = "Color is mandatory")
    private String color;

    @NotNull(message = "Weigth is mandatory")
    @NotBlank(message = "Weigth is mandatory")
    private double weigth;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public SizeAnimal getSize() {
        return size;
    }

    public void setSize(SizeAnimal size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeigth() {
        return weigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthdate='" + birthdate + '\'' +
                ", size=" + size +
                ", color='" + color + '\'' +
                ", weigth=" + weigth +
                '}';
    }
}
