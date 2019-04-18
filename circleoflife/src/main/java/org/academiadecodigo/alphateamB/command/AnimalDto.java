package org.academiadecodigo.alphateamB.command;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.academiadecodigo.alphateamB.persistence.model.animal.AnimalType;

import javax.validation.constraints.NotNull;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class AnimalDto {


    private Integer id;

    @NotNull(message = "AccountType is mandatory")
    private AnimalType animalType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public AnimalType getAnimalType() {
        return animalType;
    }

    public void setAnimalType(AnimalType animalType) {
        this.animalType = animalType;
    }
}
