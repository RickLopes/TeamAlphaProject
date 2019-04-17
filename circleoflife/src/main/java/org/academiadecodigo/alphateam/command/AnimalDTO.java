package org.academiadecodigo.alphateam.command;

import org.academiadecodigo.alphateam.model.User;


public class AnimalDTO {


    private Integer id;
    private Integer version;
    private User user;

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
}
