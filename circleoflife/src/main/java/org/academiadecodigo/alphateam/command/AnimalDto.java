package org.academiadecodigo.alphateam.command;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.academiadecodigo.alphateam.model.User;
import org.academiadecodigo.alphateam.model.animal.AnimalType;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class AnimalDto {


    private Integer id;
    private Integer version;
    private User user;
    private AnimalType type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setType(AnimalType type) {
        this.type = type;
    }

    public AnimalType getType() {
        return type;
    }
}
